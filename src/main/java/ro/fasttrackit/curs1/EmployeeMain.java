package ro.fasttrackit.curs1;

import static java.time.LocalDate.now;
import static java.time.temporal.ChronoUnit.MONTHS;
import static ro.fasttrackit.curs1.Position.PROGRAMATOR;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee programator = new Employee("Ana", now().minus(10, MONTHS), PROGRAMATOR);
        Employee ceo = Employee.buildCEO("BigBossMareSef");
        System.out.println(ceo.getClass());
        System.out.println(ceo);
    }
}
