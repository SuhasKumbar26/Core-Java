package IntermediateFunctions;
import java.util.List;

public class SortEmployees {
    public static void main(String[] args) {
        List<employee> employees = List.of(
                new employee("Sam",290111),
                new employee("Bruce", 78900),
                new employee("Alex", 58900),
                new employee("Dan", 436789)
        );

        employees.stream()
                .sorted((emp1 ,emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary()))
                .forEach(System.out::println);
    }
}
