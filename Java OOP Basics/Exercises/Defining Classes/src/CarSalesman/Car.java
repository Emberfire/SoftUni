package CarSalesman;

class Car {
    private String model;
    private Engine engine;
    private String weight;
    private String color;

    Car(String model) {
        this.model = model;
        this.weight = "n/a";
        this.color = "n/a";
    }

    Car(String model, Engine engine) {
        this(model);
        this.engine = engine;
    }

    Car(String model, Engine engine, String weight) {
        this(model, engine);
        this.weight = weight;
    }

    Car(String model, Engine engine, String weight, String color) {
        this(model, engine, weight);
        this.color = color;
    }

    void setEngine(Engine engine) {
        this.engine = engine;
    }

    void setWeight(String weight) {
        this.weight = weight;
    }

    void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.model).append(":").append("\r\n");
        sb.append("  ").append(this.engine.getModel()).append(":").append("\r\n");
        sb.append("    Power: ").append(this.engine.getPower()).append("\r\n");
        sb.append("    Displacement: ").append(this.engine.getDisplacement()).append("\r\n");
        sb.append("    Efficiency: ").append(this.engine.getEfficiency()).append("\r\n");
        sb.append("  Weight: ").append(this.weight).append("\r\n");
        sb.append("  Color: ").append(this.color);

        return sb.toString();
    }
}
