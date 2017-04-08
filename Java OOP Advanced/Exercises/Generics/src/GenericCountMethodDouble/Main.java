package GenericCountMethodDouble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(console.readLine());

        GenericBox box = new GenericBox();

        for (int i = 0; i < n; i++) {
            box.add(Double.parseDouble(console.readLine()));
        }

        double countItem = Double.parseDouble(console.readLine());
        System.out.println(box.count(countItem));
    }
}