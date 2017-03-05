package Google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Person> people = new HashSet<Person>();

        String command = console.readLine();
        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+");
            Person person = new Person(tokens[0]);

            boolean isContained = false;

            for (Person personToCheck : people) {
                if (personToCheck.getName().equals(tokens[0])) {
                    person = personToCheck;
                    isContained = true;
                    break;
                }
            }

            switch (tokens[1]) {
                case "company":
                    String name = tokens[2];
                    String department = tokens[3];
                    double salary = Double.parseDouble(tokens[4]);
                    Company company = new Company(name, salary, department);
                    person.setCompany(company);
                    break;
                case "pokemon":
                    String pokemonName = tokens[2];
                    String type = tokens[3];
                    Pokemon pokemon = new Pokemon(pokemonName, type);
                    person.setPokemon(pokemon);
                    break;
                case "parents":
                    String parentName = tokens[2];
                    String parentBirthDay = tokens[3];
                    Parent parent = new Parent(parentName, parentBirthDay);
                    person.setParents(parent);
                    break;
                case "children":
                    String childrenName = tokens[2];
                    String childrenBirthDay = tokens[3];
                    Children children = new Children(childrenName, childrenBirthDay);
                    person.setChildren(children);
                    break;
                case "car":
                    String model = tokens[2];
                    String speed = tokens[3];
                    Car car = new Car(model, speed);
                    person.setCar(car);
                    break;
            }

            if (!isContained) {
                people.add(person);
            }
            command = console.readLine();
        }

        String personToDisplay = console.readLine();

        people.stream().filter(person -> person.getName().equals(personToDisplay))
                .limit(1).forEach(person -> System.out.println(person));
    }
}