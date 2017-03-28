package Тelephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        Smartphone smartphone = new Smartphone();
        String[] tokens = console.readLine().split("\\s+");

        for (String token : tokens) {
            try {
                System.out.println(smartphone.phone(token));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }

        tokens = console.readLine().split("\\s+");

        for (String token : tokens) {
            try {
                System.out.println(smartphone.browse(token));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}