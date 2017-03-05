package Google;

class Car {
    private String model;
    private String speed;

    Car(String model, String speed) {
        this.model = model;
        this.speed = speed;
    }

     String getModel() {
        return this.model;
    }

    String getSpeed() {
        return this.speed;
    }
}