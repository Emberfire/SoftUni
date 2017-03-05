package CompanyRoster;

class Employee {
    private String name;
    private String position;
    private String departament;
    private String email;
    private double salary;
    private int age;

    Employee(String name, double salary, String position, String department) {
        this(name, salary, position, department, "n/a");
    }
    public Employee(String name, double salary, String position, String department, String email) {
        this(name, salary, position, department, email, -1);
    }
    public Employee(String name, double salary, String position, String department, String email, int age) {
        this.name = name;
        this.departament = department;
        this.position = position;
        this.salary = salary;
        this.email = email;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}