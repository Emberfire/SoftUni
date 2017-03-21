package CarShopExtended;

public class Audi implements Car, Rentable {
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;
    private int minRentDays;
    private double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String countryProduced, int minRentDays, double pricePerDay) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
        this.minRentDays = minRentDays;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public int getMinRentDays() {
        return 0;
    }

    @Override
    public double getPricePerDay() {
        return 0;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public int getHorsePower() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires", this.getModel(), this.countryProduced, Car.tires);
    }
}
