package MilitaryElite;

class Repair {
    private String partName;
    private Integer hoursWorked;

    Repair(String name, Integer hoursWorked) {
        this.setPartName(name);
        this.setHoursWorked(hoursWorked);
    }

    String getPartName() {
        return this.partName;
    }

    private void setPartName(String partName) {
        this.partName = partName;
    }

    Integer getHoursWorked() {
        return this.hoursWorked;
    }

    private void setHoursWorked(Integer hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("Part Name: %s Hours Worked: %d", this.getPartName(), this.getHoursWorked());
    }
}