package RawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashSet<Car> cars = new LinkedHashSet<>();

        int n = Integer.parseInt(console.readLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = console.readLine().split("\\s+");
            Car car = new Car(
                    tokens[0],
                    Integer.parseInt(tokens[1]),
                    Integer.parseInt(tokens[2]),
                    Integer.parseInt(tokens[3]),
                    tokens[4],
                    Double.parseDouble(tokens[5]),
                    Integer.parseInt(tokens[6]),
                    Double.parseDouble(tokens[7]),
                    Integer.parseInt(tokens[8]),
                    Double.parseDouble(tokens[9]),
                    Integer.parseInt(tokens[10]),
                    Double.parseDouble(tokens[11]),
                    Integer.parseInt(tokens[12]));

            cars.add(car);
        }

        String command = console.readLine();
        if (command.equals("fragile")) {
            cars.stream()
                    .filter(car -> car.getCargo().getCargoType().equals("fragile") &&
                    car.getTires().stream().anyMatch(tire -> tire.getPressure() < 1))
                    .forEach(car -> System.out.println(car.getModel()));
        } else if (command.equals("flamable")) {
            cars.stream()
                    .filter(car -> car.getCargo().getCargoType().equals("flamable") &&
                            car.getEngine().getPower() > 250)
                    .forEach(car -> System.out.println(car.getModel()));
        }
    }
}