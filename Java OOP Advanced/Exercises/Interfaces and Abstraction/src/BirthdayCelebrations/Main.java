package BirthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String command = console.readLine();
        ArrayList<Birthable> people = new ArrayList<>();

        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "Citizen":
                    Birthable citizen = new Citizen(tokens[3], tokens[1], tokens[2], tokens[4]);
                    people.add(citizen);
                    break;
                case "Pet":
                    Birthable pet = new Pet(tokens[1], tokens[2]);
                    people.add(pet);
                    break;
            }

            command = console.readLine();
        }

        command = console.readLine();

        for (Birthable birthable : people) {
            if (birthable.getBirthday().substring(birthable.getBirthday().length() - command.length(), birthable.getBirthday().length()).equals(command)) {
                System.out.println(birthable.getBirthday());
            }
        }
    }
}