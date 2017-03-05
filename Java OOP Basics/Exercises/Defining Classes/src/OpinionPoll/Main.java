package OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Person> persons = new HashSet<>();

        int n = Integer.parseInt(console.readLine());

        for (int i = 0; i < n; i++) {
            String command = console.readLine();
            String[] tokens = command.split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            Person person = new Person(name, age);
            if (age > 30) {
                persons.add(person);
            }
        }

        persons.stream()
                .sorted(Comparator.comparing(Person::getName))
                .forEach(person -> System.out.printf("%s - %d%n", person.getName(), person.getAge()));
    }
}
