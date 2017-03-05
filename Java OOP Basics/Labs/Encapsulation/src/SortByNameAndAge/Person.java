package SortByNameAndAge;

class Person {
    private String firstName;
    private String lastName;
    private int age;

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    String getFirstName() {
        return this.firstName;
    }

    int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s %s is a %d years old.", this.firstName, this.lastName, this.age);
    }
}