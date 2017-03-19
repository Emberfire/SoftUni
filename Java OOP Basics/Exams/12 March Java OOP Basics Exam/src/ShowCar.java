public class ShowCar extends Car {
    private int stars;

    public ShowCar(String brand, String model, int yearOfProduction, int horsePower, int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, horsePower, acceleration, suspension, durability);
    }



    public void addStars(int stars) {
        this.setStars(this.getStars() + stars);
    }

    public final int getStars() {
        return this.stars;
    }

    private void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s %s %d%n", this.getBrand(), this.getModel(), this.getYearOfProduction()))
                .append(String.format("%d HP, 100 m/h in %d s%n", this.getHorsePower(), this.getAcceleration()))
                .append(String.format("%d Suspension force, %d Durability%n", this.getSuspension(), this.getDurability()))
                .append(String.format("%d *", this.getStars()));
        return sb.toString();
    }
}