package FirstAndReserveTeam;

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
            Person person = new Person(tokens[0], tokens[1], Integer.parseInt(tokens[2]), Double.parseDouble(tokens[3]));
            people.add(person);
        }

        Team team = new Team("Minior");
        for (Person person : people) {
            if (person.getAge() < 40) {
                team.addPlayer(person);
            } else {
                team.addPlayer(person);
            }
        }

        System.out.println("First team have " + team.getFirstTeam().size() + " players");
        System.out.println("Reserve team have " + team.getReserveTeam().size() + " players");
    }
}
