public abstract class Car {
    private String brand;
    private String model;
    private int yearOfProduction;
    private int horsePower;
    private int acceleration;
    private int suspension;
    private int durability;
    private int performancePoints;

    protected Car(String brand, String model, int yearOfProduction, int horsePower, int acceleration, int suspension, int durability) {
        this.setBrand(brand);
        this.setModel(model);
        this.setYearOfProduction(yearOfProduction);
        this.setHorsePower(horsePower);
        this.setAcceleration(acceleration);
        this.setSuspension(suspension);
        this.setDurability(durability);
    }

    public void tuneCar(int tuneIndex) {
        this.setHorsePower(this.getHorsePower() + tuneIndex);
        this.setSuspension(this.getSuspension() + ((tuneIndex * 50) / 100));
    }

    @Override
    public abstract String toString();


    public final String getBrand() {
        return this.brand;
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }

    public final String getModel() {
        return this.model;
    }

    private void setModel(String model) {
        this.model = model;
    }

    public final int getYearOfProduction() {
        return this.yearOfProduction;
    }

    private void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public final int getHorsePower() {
        return this.horsePower;
    }

    private void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public final int getAcceleration() {
        return this.acceleration;
    }

    private void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public final int getSuspension() {
        return this.suspension;
    }

    private void setSuspension(int suspension) {
        this.suspension = suspension;
    }

    public final int getDurability() {
        return this.durability;
    }

    private void setDurability(int durability) {
        this.durability = durability;
    }

    public final int getPerformancePoints() {
        return this.performancePoints;
    }

    public void setPerformancePoints(int performancePoints) {
        this.performancePoints = performancePoints;
    }
}