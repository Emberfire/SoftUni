package VehiclesExtension;

class Bus extends Vehicle {
    Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + 1.4, tankCapacity);
    }

    @Override
    void drive(double distance) {
        double fuelNeeded = this.getFuelConsumption() * distance;

        if (fuelNeeded > this.getFuelQuantity()) {
            throw new IllegalArgumentException("Bus needs refueling");
        }

            this.setFuelQuantity(this.getFuelQuantity() - fuelNeeded);
    }

    void driveEmpty(double distance) {
        this.setFuelConsumption(this.getFuelConsumption() - 1.4);
        this.drive(distance);
        this.setFuelConsumption(this.getFuelConsumption() + 1.4);
    }

    @Override
    void refuel(double fuel) {
        if (fuel > this.getTankCapacity()) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }

        this.setFuelQuantity(this.getFuelQuantity() + fuel);
    }
}