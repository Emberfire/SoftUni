package MilitaryElite;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

class Commando extends SpecialisedSoldier implements ICommando {
    private Set<Mission> missions;

    Commando(String id, String firstName, String lastName, Double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.setMissions(new LinkedHashSet<>());
    }

    void addMission(Mission mission) {
        this.missions.add(mission);
    }

    @Override
    public Set<Mission> getMissions() {
        return Collections.unmodifiableSet(missions);
    }

    private void setMissions(Set<Mission> missions) {
        this.missions = missions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("\nMissions:");

        for (Mission mission : this.getMissions()) {
            sb.append("\n  ").append(mission.toString());
        }

        return sb.toString();
    }
}