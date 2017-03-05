package SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashSet<Car> cars = new LinkedHashSet<>();

        int n = Integer.parseInt(console.readLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = console.readLine().split("\\s+");
            String model = tokens[0];
            double fuel = Double.parseDouble(tokens[1]);
            double burn = Double.parseDouble(tokens[2]);
            Car car = new Car(model, fuel, burn);
            cars.add(car);
        }

        String command = console.readLine();
        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+");
            String model = tokens[1];
            double distance = Double.parseDouble(tokens[2]);
            Optional<Car> carDriven = cars.stream().filter(a -> a.getModel().equals(model)).findFirst();

            if (carDriven.isPresent()) {
                try {
                    carDriven.get().Travel(distance);
                } catch (IllegalStateException ex) {
                    System.out.println("Insufficient fuel for the drive");
                }
            }

            command = console.readLine();
        }

        for (Car car : cars) {
            System.out.printf("%s %.2f %.0f%n", car.getModel(), car.getFuel(), car.getDistance());
        }
    }
}