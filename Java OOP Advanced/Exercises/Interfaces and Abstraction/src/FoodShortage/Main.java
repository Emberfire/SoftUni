package FoodShortage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(console.readLine());
        List<BaseEntry> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] command = console.readLine().split("\\s+");

            switch (command.length) {
                case 4:
                    String name = command[0];
                    String age = command[1];
                    String id = command[2];
                    String birthday = command[3];
                    BaseEntry citizen = new Citizen(id, name, age, birthday);
                    people.add(citizen);
                    break;
                case 3:
                    name = command[0];
                    age = command[1];
                    String group = command[2];
                    BaseEntry rebel = new Rebel(name, age, group);
                    people.add(rebel);
            }
        }

        String command = console.readLine();


        while (!command.equals("End")) {
            String name = command;
            people.stream().filter(person -> person.getName().equals(name))
                    .limit(1)
                    .forEach(Buyer::buyFood);

            command = console.readLine();
        }

        System.out.println(people.stream().mapToInt(BaseEntry::getFoodBought).sum());
    }
}