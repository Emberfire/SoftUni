package CustomList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        CommandInterpreter interpreter = new CommandInterpreter();

        String[] tokens = console.readLine().split("\\s+");

        while (!tokens[0].equals("END")) {
            interpreter.interpretCommand(tokens[0], tokens);
            tokens = console.readLine().split("\\s+");
        }
    }
}