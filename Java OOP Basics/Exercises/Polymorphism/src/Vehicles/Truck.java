package Vehicles;

class Truck extends Vehicle {

    Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        this.setFuelConsumption(this.getFuelConsumption() + 1.6);
    }

    @Override
    void drive(double distance) {
        double fuelNeeded = this.getFuelConsumption() * distance;

        if (fuelNeeded > this.getFuelQuantity()) {
            throw new IllegalArgumentException("Truck needs refueling");
        } else {
            this.setFuelQuantity(this.getFuelQuantity() - fuelNeeded);
        }
    }

    @Override
    void refuel(double fuel) {
        this.setFuelQuantity(this.getFuelQuantity() + (fuel * 0.95));
    }
}