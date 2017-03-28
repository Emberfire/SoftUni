package MilitaryElite;

abstract class SpecialisedSoldier extends Private implements ISpecialisedSoldier {
    private String corps;

    SpecialisedSoldier(String id, String firstName, String lastName, Double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }

    @Override
    public String getCorps() {
        return this.corps;
    }

    private void setCorps(String corps) {
        if (!corps.equals("Airforces") && !corps.equals("Marines")) {
            throw new IllegalArgumentException("Invalid corps!");
        }

        this.corps = corps;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(String.format("%nCorps: %s", this.getCorps()));

        return sb.toString();
    }
}