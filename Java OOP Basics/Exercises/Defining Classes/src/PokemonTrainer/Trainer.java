package PokemonTrainer;

import java.util.ArrayList;

class Trainer {
    private String name;
    private int badges;
    private ArrayList<Pokemon> pokemons;

    Trainer(String name) {
        this.name = name;
        this.pokemons = new ArrayList<>();
    }

    String getName() {
        return this.name;
    }

    void addBadge() {
        this.badges++;
    }

    void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    ArrayList<Pokemon> getPokemon() {
        return this.pokemons;
    }

    int getBadges() {
        return this.badges;
    }
}