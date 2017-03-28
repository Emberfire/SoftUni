package MilitaryElite;

class Mission {
    private String codeName;
    private String state;

    Mission(String codeName, String state) {
        this.setCodeName(codeName);
        this.setState(state);
    }

    void completeMission() {
        this.setState("Finished");
    }

    String getCodeName() {
        return this.codeName;
    }

    private void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    String getState() {
        return this.state;
    }

    private void setState(String state) {
        if (!state.equals("inProgress") && !state.equals("Finished")) {
            throw new IllegalArgumentException("Invalid mission state!");
        }

        this.state = state;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", this.getCodeName(), this.getState());
    }
}