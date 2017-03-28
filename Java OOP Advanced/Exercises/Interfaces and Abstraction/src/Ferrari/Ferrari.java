package Ferrari;

class Ferrari implements Car {
    private String model;
    private String driver;

    Ferrari(String driver) {
        this.model = "488-Spider";
        this.driver = driver;
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "Zadu6avam sA!";
    }

    public String getModel() {
        return this.model;
    }

    public String getDriver() {
        return this.driver;
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s", this.getModel(), this.brakes(), this.gas(), this.getDriver());
    }
}