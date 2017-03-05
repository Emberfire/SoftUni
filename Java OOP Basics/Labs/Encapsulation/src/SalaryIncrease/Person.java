package SalaryIncrease;

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    void increaseSalary(int bonus) {
        if (this.age >= 30) {
            this.salary += this.salary * bonus / 100;
        } else {
            this.salary += this.salary * bonus / 200;
        }
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + "get " + salary + " leva";
    }
}