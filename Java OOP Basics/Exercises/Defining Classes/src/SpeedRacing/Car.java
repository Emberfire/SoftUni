package SpeedRacing;

public class Car {
    private String model;
    private double fuel;
    private double burn;
    private double distance;

    Car(String model, double fuel, double burn) {
        this.model = model;
        this.fuel = fuel;
        this.burn = burn;
    }

    void Travel(double distance) {
        if (burn * distance > fuel) {
            throw new IllegalStateException();
        } else {
            this.fuel -= burn * distance;
            this.distance += distance;
        }
    }

    String getModel() {
        return this.model;
    }

    double getFuel() {
        return this.fuel;
    }

    public double getDistance() {
        return this.distance;
    }
}