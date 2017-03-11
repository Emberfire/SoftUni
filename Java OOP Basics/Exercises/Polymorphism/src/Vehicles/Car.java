package Vehicles;

class Car extends Vehicle {

    Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        this.setFuelConsumption(this.getFuelConsumption() + 0.9);
    }

    @Override
    void drive(double distance) {
        double fuelNeeded = distance * this.getFuelConsumption();         //!!

        if (fuelNeeded > this.getFuelQuantity()) {
            throw new IllegalArgumentException("Car needs refueling");
        } else {
            this.setFuelQuantity(this.getFuelQuantity() - fuelNeeded);     //!!
        }
    }

    @Override
    void refuel(double fuel) {
        this.setFuelQuantity(this.getFuelQuantity() + fuel);
    }
}