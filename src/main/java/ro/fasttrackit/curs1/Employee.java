package ro.fasttrackit.curs1;

import java.time.LocalDate;

public class Employee {
    private final String name;
    private final LocalDate employmentDate;
    private final Position position;

    public Employee(String name, LocalDate employmentDate, Position position) {
        this.name = name;
        this.employmentDate = employmentDate;
        this.position = position;
    }

    public static Employee buildCEO(String name) {
        if (name == null || name.length() < 10) {
            return new Employee("Ion", LocalDate.now(), Position.CEO);
        } else {
            return new CTO(name, LocalDate.now());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        if (employmentDate != null ? !employmentDate.equals(employee.employmentDate) : employee.employmentDate != null)
            return false;
        return position == employee.position;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (employmentDate != null ? employmentDate.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employmentDate=" + employmentDate +
                ", position=" + position +
                '}';
    }

    public String getName() {
        return name;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public Position getPosition() {
        return position;
    }
}

class CTO extends Employee {

    public CTO(String name, LocalDate employmentDate) {
        super(name, employmentDate, Position.CTO);
    }
}

enum Position {
    CEO,
    CFO,
    CTO,
    PROGRAMATOR
}
