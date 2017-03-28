package MilitaryElite;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

class LeutenantGeneral extends Private implements ILeutenantGeneral {
    private Set<Soldier> privates;

    LeutenantGeneral(String id, String firstName, String lastName, Double salary) {
        super(id, firstName, lastName, salary);
        this.setSoldiers(new LinkedHashSet<>());
    }

    void addSoldier(Soldier _private) {
        this.privates.add(_private);
    }

    @Override
    public Set<Soldier> getSoldiers() {
        return Collections.unmodifiableSet(privates);
    }

    private void setSoldiers(Set<Soldier> soldiers) {
        this.privates = soldiers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("\nPrivates:");

        for (Soldier aPrivate : this.getSoldiers()) {
            sb.append("\n  ").append(aPrivate);
        }

        return sb.toString();
    }
}