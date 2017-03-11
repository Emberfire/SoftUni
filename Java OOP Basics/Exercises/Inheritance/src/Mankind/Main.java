package Mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        Worker worker;
        Student student;
        String[] line1 = console.readLine().split("\\s+");
        String[] line2 = console.readLine().split("\\s+");
        try {
            student = new Student(line1[0], line1[1], line1[2]);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return;
        }

        try {
            worker = new Worker(line2[0], line2[1], Double.parseDouble(line2[2]), Double.parseDouble(line2[3]));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return;
        }

        System.out.println(student);
        System.out.println(worker);
    }
}