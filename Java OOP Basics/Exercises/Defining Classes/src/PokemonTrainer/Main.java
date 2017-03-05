package PokemonTrainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Trainer> trainers = new ArrayList<>();

        String command = console.readLine();
        while (!command.equals("Tournament")) {
            String[] tokens = command.split("\\s+");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            if (trainers.stream().anyMatch(trainer -> trainer.getName().equals(trainerName))) {
                Optional<Trainer> trainerToModify = trainers.stream().filter(trainer -> trainer.getName().equals(trainerName)).findFirst();

                if (trainerToModify.isPresent()) {
                    trainerToModify.get().addPokemon(pokemon);
                }
            } else {
                Trainer trainer = new Trainer(trainerName);
                trainer.addPokemon(pokemon);
                trainers.add(trainer);
            }

            command = console.readLine();
        }

        command = console.readLine();
        while (!command.equals("End")) {
            String element = command;
            for (Trainer trainer : trainers) {
                if (trainer.getPokemon().stream().anyMatch(pokemon -> pokemon.getElement().equals(element))) {
                    trainer.addBadge();
                } else {
                    ArrayList<Pokemon> pokemons = trainer.getPokemon();
                    for (int i = 0; i < pokemons.size(); i++) {
                        try {
                            pokemons.get(i).hit();
                        } catch (Exception ex) {
                            pokemons.remove(i);
                            i--;
                        }
                    }
                }
            }

            command = console.readLine();
        }

        trainers.stream().sorted(Comparator.comparingInt(Trainer::getBadges)
        .reversed())
                .forEach(trainer -> System.out.printf("%s %d %d%n", trainer.getName(), trainer.getBadges(), trainer.getPokemon().size()));
    }
}