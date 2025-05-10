package collections;

import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employees;

    public Company() {
        employees = new ArrayList<Employee>();
    }

    public String getListOfEmployees() {
        StringBuilder sb = new StringBuilder("Сотрудники:\n");
        int count = 1;
        for (Employee item : employees) {
            sb.append(count++)
                    .append(". ")
                    .append(item.toString());
        }
        return sb.toString();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public int getNumberOfEmployees() {
        return employees.size();
    }

    public Employee getMaxSalaryEmployee() {
        if (employees.isEmpty())
            return null;

        Employee employee = employees.get(0);
        for (Employee item : employees) {
            if (item.salary > employee.salary)
                employee = item;
        }

        return employee;
    }

    public double getAverageSalary() {
        double totalSalary = 0;
        for (Employee item : employees) {
            totalSalary += item.salary;
        }

        return totalSalary / employees.size();
    }
}
