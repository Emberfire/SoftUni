package SingleInheritance;

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name’s length should not be less than 3 symbols!");
        }
    }

    private int getAge() {
        return this.age;
    }

    void setAge(int age) {
        if (age >= 1) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be positive!");
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d", this.getName(), this.getAge());
    }
}