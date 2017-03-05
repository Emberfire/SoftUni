package CreatingConstructors;

class Person {
    private String name;
    private int age;

    public Person() {
        this("No name", 1);
    }

    public Person(int age) {
        this("No name", age);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }
}