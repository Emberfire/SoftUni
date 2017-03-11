package Animals;

class Animal {
    private String type;
    private String name;
    private int age;
    private String gender;

    Animal(String type, String name, int age, String gender) {
        this.setType(type);
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    private String getType() {
        return this.type;
    }

    private void setType(String type) {
        this.type = type;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalit input!");
        }

        this.age = age;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }
}