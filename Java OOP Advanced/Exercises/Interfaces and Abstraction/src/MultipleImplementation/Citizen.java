package MultipleImplementation;

class Citizen implements Person, Birthable, Identifiable {
    private String name;
    private Integer age;
    private String id;
    private String birthdate;

    Citizen(String name, Integer age, String id, String birthdate) {
        this.id = id;
        this.birthdate = birthdate;
    }


    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getBirthdate() {
        return this.birthdate;
    }
}