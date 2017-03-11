package VehiclesExtension;

class Car extends Vehicle {

    Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.setFuelConsumption(this.getFuelConsumption() + 0.9);
    }

    @Override
    void drive(double distance) {
        double fuelNeeded = distance * this.getFuelConsumption();

        if (fuelNeeded > this.getFuelQuantity()) {
            throw new IllegalArgumentException("Car needs refueling");
        } else {
            this.setFuelQuantity(this.getFuelQuantity() - fuelNeeded);
        }
    }

    @Override
    void refuel(double fuel) {
        if (fuel > this.getTankCapacity()) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }

        this.setFuelQuantity(this.getFuelQuantity() + fuel);
    }
}