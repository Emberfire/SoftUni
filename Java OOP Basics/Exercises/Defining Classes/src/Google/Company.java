package Google;

class Company {
    private String name;
    private double salary;
    private String department;

    Company(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    String getName() {
        return this.name;
    }

    String getDepartment() {
        return this.department;
    }

    double getSalary() {
        return this.salary;
    }
}