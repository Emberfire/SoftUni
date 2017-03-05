package CompanyRoster;

import java.util.ArrayList;

class Department {
    private String name;
    private ArrayList<Employee> employees;

    Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployees() {
        return this.employees;
    }


    public String getName() {
        return this.name;
    }
}
