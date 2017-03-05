package CarSalesman;

class Engine {
    private String model;
    private String power;
    private String displacement;
    private String efficiency;

    Engine(String model, String power) {
        this.model = model;
        this.power = power;
        this.displacement = "n/a";
        this.efficiency = "n/a";
    }

    void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    String getModel() {
        return this.model;
    }

    String getPower() {
        return this.power;
    }

    String getDisplacement() {
        return this.displacement;
    }

    String getEfficiency() {
        return this.efficiency;
    }
}