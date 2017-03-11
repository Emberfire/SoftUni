package Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = console.readLine().split("\\s+");
        double carFuelQuantity = Double.parseDouble(tokens[1]);
        double carFuelConsumption = Double.parseDouble(tokens[2]);
        Car car = new Car(carFuelQuantity, carFuelConsumption);

        tokens = console.readLine().split("\\s+");
        double truckFuelQuantity = Double.parseDouble(tokens[1]);
        double truckFuelConsumption = Double.parseDouble(tokens[2]);
        Truck truck = new Truck(truckFuelQuantity, truckFuelConsumption);

        DecimalFormat format = new DecimalFormat("0.######");
        int n = Integer.parseInt(console.readLine());
        for (int i = 0; i < n; i++) {
            String[] line = console.readLine().split("\\s+");
            String command = line[0];
            String vehicle = line[1];
            double parameter = Double.parseDouble(line[2]);

            if (command.equals("Drive")) {
                if (vehicle.equals("Car")) {
                    try {
                        car.drive(parameter);
                        System.out.printf("Car travelled %s km%n", format.format(parameter));
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                } else if (vehicle.equals("Truck")) {
                    try {
                        truck.drive(parameter);
                        System.out.printf("Truck travelled %s km%n", format.format(parameter));
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            } else if (command.equals("Refuel")) {
                if (vehicle.equals("Car")) {
                        car.refuel(parameter);
                } else if(vehicle.equals("Truck")) {
                    truck.refuel(parameter);
                }
            }
        }

        System.out.printf("Car: %.2f%n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f%n", truck.getFuelQuantity());
    }
}