package VehiclesExtension;

class Truck extends Vehicle {

    Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
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
        if (fuel > this.getTankCapacity()) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        } else {
            this.setFuelQuantity(this.getFuelQuantity() + (fuel * 0.95));
        }
    }
}