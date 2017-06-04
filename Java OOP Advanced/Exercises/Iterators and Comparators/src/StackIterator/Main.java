package StackIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        CustomStack customStack = new CustomStack();

        String command = console.readLine();
        while (!command.equals("END")) {
            String[] tokens = Arrays.stream(command.split("[, ]"))
                    .filter(a -> a.length() != 0)
                    .toArray(String[]::new);

            if (tokens[0].equals("Push")) {
                for (int i = 1; i < tokens.length; i++) {
                    customStack.push(Integer.parseInt(tokens[i]));
                }
            } else if (tokens[0].equals("Pop")) {
                try {
                    customStack.pop();
                } catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }
            }

            command = console.readLine();
        }

        for (int i = 0; i < 2; i++) {
            for (Integer integer : customStack) {
                System.out.println(integer + " ");
            }
        }
    }
}