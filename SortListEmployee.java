package Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortListEmployee {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Vijay Reddy", 30000.0),
                new Employee(2, "Amit Shah", 60000.0),
                new Employee(3, "Sara Khan", 50000.0),
                new Employee(4, "Amit Shah", 40000.0)
        );

        Optional<Employee> employee = employees.stream().sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder())).
                skip(1).findFirst();

        System.out.println(employee.get().getId() + " "
                + employee.get().getName() + " " + employee.get().getSalary());
    }
}
