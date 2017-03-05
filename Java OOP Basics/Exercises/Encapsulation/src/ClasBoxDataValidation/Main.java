package ClasBoxDataValidation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        double l = Double.parseDouble(console.readLine());
        double w = Double.parseDouble(console.readLine());
        double h = Double.parseDouble(console.readLine());
        try {
            Box box = new Box(l, w, h);

            System.out.printf("Surface Area - %.2f%nLateral Surface Area - %.2f%nVolume - %.2f%n",
                    box.calculateArea(l, w, h), box.calculateLateralArea(l, w, h), box.calculateVolume(l, w, h));
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
