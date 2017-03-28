package BorderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String command = console.readLine();
        ArrayList<Identifiable> people = new ArrayList<>();

        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+");
            if (tokens.length == 3) {
                String name = tokens[0];
                String age = tokens[1];
                String id = tokens[2];
                Identifiable person = new Citizen(id, name, age);
                people.add(person);
            } else if (tokens.length == 2) {
                String model = tokens[0];
                String id = tokens[1];
                Identifiable robot = new Robot(id, model);
                people.add(robot);
            }

            command = console.readLine();
        }

        command = console.readLine();

        for (Identifiable identifiable : people) {
            if (identifiable.getId().substring(identifiable.getId().length() - command.length(), identifiable.getId().length()).equals(command)) {
                System.out.println(identifiable.getId());
            }
        }
    }
}