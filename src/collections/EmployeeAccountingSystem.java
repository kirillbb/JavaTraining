package collections;

import java.util.Scanner;

public class EmployeeAccountingSystem {
    public static void main(String[] args) {
        Company company = new Company();
        employeeDataEntry(company);

        System.out.println(summary(company));
    }

    public static void employeeDataEntry(Company company) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите ФИО (или 'стоп' для завершения): ");
            String input = scanner.nextLine();

            if (isStop(input))
                break;

            Employee employee = new Employee();
            employee.fullName = input;

            System.out.println("Введите должность: ");
            employee.position = scanner.nextLine();

            System.out.println("Введите зарплату: ");
            employee.salary = scanner.nextDouble();
            scanner.nextLine();

            company.addEmployee(employee);
        }
    }

    public static String summary(Company company) {
        StringBuilder sb = new StringBuilder();

        sb.append(company.getListOfEmployees())
                .append("Всего сотрудников: ")
                .append(company.getNumberOfEmployees()).append("\n")
                .append("Средняя зарплата: ")
                .append((String.format("%2.2f", company.getAverageSalary()))).append(" $\n");

        Employee top = company.getMaxSalaryEmployee();
        if (top != null)
            sb.append("Сотрудник с максимальной зарплатой: ")
                    .append(top)
                    .append("\n");
        return sb.toString();
    }

    public static boolean isStop(String string) {
        return string.equalsIgnoreCase("stop");
    }
}
