package Mankind;

public class Worker extends Human{
    private double weekSalary;
    private double workHours;
    private double salaryPerHour;

    Worker(String firstName, String lastName, double weekSalary, double workHours) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHours(workHours);
        this.setSalaryPerHour(weekSalary, workHours);
    }

    private double getWeekSalary() {
        return this.weekSalary;
    }

    private void setWeekSalary(double weekSalary) {
        if (weekSalary < 11) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }

        this.weekSalary = weekSalary;
    }

    private double getWorkHours() {
        return this.workHours;
    }

    private void setWorkHours(double workHours) {
        if (workHours < 1 || workHours > 12) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }

        this.workHours = workHours;
    }

    private double getSalaryPerHour() {
        return this.salaryPerHour;
    }

    private void setSalaryPerHour(double weekSalary, double workHours) {
        this.salaryPerHour = weekSalary / 7 / workHours;
    }

    @Override
    protected void setLastName(String lastName) {
        if (lastName.length() < 4) {
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }

        super.setLastName(lastName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("First Name: %s%n", super.getFirstName()))
                .append(String.format("Last Name: %s%n", super.getLastName()))
                .append(String.format("Week Salary: %.2f%n", this.getWeekSalary()))
                .append(String.format("Hours per day: %.2f%n", this.getWorkHours()))
                .append(String.format("Salary per hour: %.2f", this.getSalaryPerHour()));
        return sb.toString();
    }
}