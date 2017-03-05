package CarSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Engine> engines = new ArrayList<>();


        int n = Integer.parseInt(console.readLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = console.readLine().split("\\s+");
            String model = tokens[0];
            String power = tokens[1];
            Engine engine = new Engine(model, power);
            if (tokens.length == 3) {
                if (checkIfIsNum(tokens[2])) {
                    String displacement = tokens[2];
                    engine.setDisplacement(displacement);
                } else {
                    String efficiency = tokens[2];
                    engine.setEfficiency(efficiency);
                }
            } else if (tokens.length == 4) {
                String displacement = tokens[2];
                String efficiency = tokens[3];
                engine.setDisplacement(displacement);
                engine.setEfficiency(efficiency);
            }

            engines.add(engine);
        }

        int m = Integer.parseInt(console.readLine());
        for (int i = 0; i < m; i++) {
            String[] tokens = console.readLine().split("\\s+");
            String model = tokens[0];
            String engine = tokens[1];
            Car car = new Car(model);

            Optional<Engine> engineToPut = engines.stream().filter(eng -> eng.getModel().equals(engine)).findFirst();

            if (engineToPut.isPresent()) {
                car.setEngine(engineToPut.get());
            }

            if (tokens.length == 3) {
                if (checkIfIsNum(tokens[2])) {
                    String weight = tokens[2];
                    car.setWeight(weight);
                } else {
                    String color = tokens[2];
                    car.setColor(color);
                }
            } else if (tokens.length == 4) {
                String weight = tokens[2];
                String color = tokens[3];
                car.setWeight(weight);
                car.setColor(color);
            }

            System.out.println(car);
        }
    }

    private static boolean checkIfIsNum(String input) {
        try {
            Integer.parseInt(input);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
}