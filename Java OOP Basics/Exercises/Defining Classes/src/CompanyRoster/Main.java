package CompanyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Department> departments = new ArrayList<>();

        int n = Integer.parseInt(console.readLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = console.readLine().split("\\s+");
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String department = tokens[3];

            Employee employee = new Employee(name, salary, position, department);
            if (tokens.length == 5) {
                if (checkIfIsNum(tokens[4])) {
                    int age = Integer.parseInt(tokens[4]);
                    employee.setAge(age);
                } else {
                    String email = tokens[4];
                    employee.setEmail(email);
                }
            } else if (tokens.length == 6) {
                String email = tokens[4];
                int age = Integer.parseInt(tokens[5]);
                employee.setEmail(email);
                employee.setAge(age);
            }

            if (departments.stream().noneMatch(dep -> dep.getName().equals(department))) {
                Department newDepartment = new Department(department);
                newDepartment.getEmployees().add(employee);
                departments.add(newDepartment);
            } else {
                Optional<Department> departmentToAdd = departments.stream().filter(dep -> dep.getName().equals(department)).findFirst();

                if (departmentToAdd.isPresent()) {
                    departmentToAdd.get().getEmployees().add(employee);
                }
            }
        }

        departments.stream()
                .sorted(Comparator.<Department>comparingDouble(dep -> dep.getEmployees().stream().mapToDouble(Employee::getSalary).average().orElse(0))
                        .reversed())
                .limit(1)
                .forEach(dep -> {
                    System.out.println("Highest Average Salary: " + dep.getName());

                    dep.getEmployees().stream()
                            .sorted(Comparator.<Employee>comparingDouble(Employee::getSalary)
                            .reversed())
                    .forEach(employee -> System.out.printf("%s %.2f %s %d%n", employee.getName(), employee.getSalary(), employee.getEmail(), employee.getAge()));
                });
    }

    private static boolean checkIfIsNum(String num) {
        try {
            Integer.parseInt(num);
        } catch (Exception ex) {
            return false;
        }

        return true;
    }
}