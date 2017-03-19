import java.util.ArrayList;

public class PerformanceCar extends Car {
    private ArrayList<String> addOns;

    public PerformanceCar(String brand, String model, int yearOfProduction, int horsePower, int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, horsePower + (horsePower * 50) / 100, acceleration, suspension - (suspension * 25) / 100, durability);
        this.setAddOns(new ArrayList<>());
    }


    public final ArrayList<String> getAddOns() {
        return this.addOns;
    }

    private void setAddOns(ArrayList<String> addOns) {
        this.addOns = addOns;
    }

    @Override
    public String toString() {
        StringBuilder addonsToPrint = new StringBuilder();
        if (this.getAddOns().isEmpty()) {
            addonsToPrint.append("None");
        } else {
            for (String addOn : addOns) {
                addonsToPrint.append(addOn).append(" ");
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s %s %d%n", this.getBrand(), this.getModel(), this.getYearOfProduction()))
                .append(String.format("%d HP, 100 m/h in %d s%n", this.getHorsePower(), this.getAcceleration()))
                .append(String.format("%d Suspension force, %d Durability%n", this.getSuspension(), this.getDurability()))
                .append(String.format("Add-ons: %s", addonsToPrint.toString()));

        return sb.toString();
    }
}