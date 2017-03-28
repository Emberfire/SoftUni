package MilitaryElite;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

class Engineer extends SpecialisedSoldier implements IEngineer {
    private Set<Repair> repairs;

    Engineer(String id, String firstName, String lastName, Double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.setRepairs(new LinkedHashSet<>());
    }

    void addRepair(Repair repair) {
        this.repairs.add(repair);
    }

    @Override
    public Set<Repair> getRepairs() {
        return Collections.unmodifiableSet(repairs);
    }

    private void setRepairs(Set<Repair> repairs) {
        this.repairs = repairs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("\nRepairs:");

        for (Repair repair : this.getRepairs()) {
            sb.append("\n  ").append(repair);
        }

        return sb.toString();
    }
}