package CarShop;

import java.io.Serializable;

public class Seat implements Car, Serializable {
    private String model;
    private String color;
    private int horsePower;
    private String countryProduced;

    public Seat(String model, String color, int horsePower, String countryProduced) {
        this.setModel(model);
        this.setColor(color);
        this.setHorsePower(horsePower);
        this.setCountryProduced(countryProduced);
    }

    @Override
    public String getModel() {
        return this.model;
    }

    private void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getColor() {
        return this.model;
    }

    private void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getHorsePower() {
        return this.horsePower;
    }

    private void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getCountryProduced() {
        return this.countryProduced;
    }

    private void setCountryProduced(String countryProduced) {
        this.countryProduced = countryProduced;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires", this.getModel(), this.getCountryProduced(), Car.tires);
    }
}