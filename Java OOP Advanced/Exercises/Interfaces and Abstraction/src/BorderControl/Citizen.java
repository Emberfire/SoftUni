package BorderControl;

class Citizen implements Identifiable {
    private String id;
    private String name;
    private String age;

    public Citizen(String id, String name, String age) {
        this.setId(id);
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return this.age;
    }

    private void setAge(String age) {
        this.age = age;
    }

    @Override
    public String getId() {
        return this.id;
    }

    private void setId(String id) {
        this.id = id;
    }
}