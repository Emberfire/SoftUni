package SortByNameAndAge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Person> people = new ArrayList<>();

        int n = Integer.parseInt(console.readLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = console.readLine().split("\\s+");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            Person person = new Person(firstName, lastName, age);
            people.add(person);
        }

        people.stream()
                .sorted((p1, p2) -> {
                    int result = p1.getFirstName().compareTo(p2.getFirstName());

                    if (result == 0) {
                        Integer p1Age = p1.getAge();
                        Integer p2Age = p2.getAge();

                        result = p1Age.compareTo(p2Age);
                    }

                    return result;
                })
                .forEach(System.out::println);
    }
}