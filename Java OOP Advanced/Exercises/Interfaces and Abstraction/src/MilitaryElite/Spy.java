package MilitaryElite;

class Spy extends Soldier implements ISpy {
    private String codeNumber;

    Spy(String id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.setCodeNumber(codeNumber);
    }

    @Override
    public String getCodeNumber() {
        return this.codeNumber;
    }

    private void setCodeNumber(String codeNumber) {
        this.codeNumber = codeNumber;
    }

    @Override
    public String toString() {

        return String.format("Name: %s %s Id: %s", this.getFirstName(), this.getLastName(), this.getId()) +
                String.format("\nCode Number: %s", this.getCodeNumber());
    }
}