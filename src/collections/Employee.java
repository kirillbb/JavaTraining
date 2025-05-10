package collections;

public class Employee {
    String fullName;
    String position;
    double salary;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(fullName)
                .append(" - ")
                .append(position)
                .append(" - ")
                .append(String.format("%.2f", salary))
                .append(" $\n");

        return sb.toString();
    }
}
