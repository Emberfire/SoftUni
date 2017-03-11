package VehiclesExtension;

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
        double carTankCapacity = Double.parseDouble(tokens[3]);
        Car car = new Car(carFuelQuantity, carFuelConsumption, carTankCapacity);

        tokens = console.readLine().split("\\s+");
        double truckFuelQuantity = Double.parseDouble(tokens[1]);
        double truckFuelConsumption = Double.parseDouble(tokens[2]);
        double truckTankCapacity = Double.parseDouble(tokens[3]);
        Truck truck = new Truck(truckFuelQuantity, truckFuelConsumption, truckTankCapacity);

        tokens = console.readLine().split("\\s+");
        double busFuelQuantity = Double.parseDouble(tokens[1]);
        double busFuelConsumption = Double.parseDouble(tokens[2]);
        double busTankCapacity = Double.parseDouble(tokens[3]);
        Bus bus = new Bus(busFuelQuantity, busFuelConsumption, busTankCapacity);

        DecimalFormat format = new DecimalFormat("0.######");
        int n = Integer.parseInt(console.readLine());
        for (int i = 0; i < n; i++) {
            String[] line = console.readLine().split("\\s+");
            String command = line[0];
            String vehicle = line[1];
            double parameter = Double.parseDouble(line[2]);

            try {
                switch (command) {
                    case "Drive":
                        switch (vehicle) {
                            case "Car":
                                car.drive(parameter);
                                System.out.printf("Car travelled %s km%n", format.format(parameter));
                                break;
                            case "Truck":
                                truck.drive(parameter);
                                System.out.printf("Truck travelled %s km%n", format.format(parameter));
                                break;
                            case "Bus":
                                bus.drive(parameter);
                                    System.out.printf("Bus travelled %s km%n", format.format(parameter));
                                break;
                        }
                        break;
                    case "DriveEmpty":
                        if (vehicle.equals("Bus")) {
                            bus.driveEmpty(parameter);
                            System.out.printf("Bus travelled %s km%n", format.format(parameter));
                        }
                        break;
                    case "Refuel":
                        switch (vehicle) {
                            case "Car":
                                car.refuel(parameter);
                                break;
                            case "Truck":
                                truck.refuel(parameter);
                                break;
                            case "Bus":
                                bus.refuel(parameter);
                                break;
                        }
                        break;
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }

        System.out.printf("Car: %.2f%n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f%n", truck.getFuelQuantity());
        System.out.printf("Bus: %.2f%n", bus.getFuelQuantity());
    }
}