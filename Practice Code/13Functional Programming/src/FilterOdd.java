import java.util.List;

public class FilterOdd {
    public static void main(String[] args){
        List<Integer> numbers = List.of(1,23,45,67,34,12,98,99);

        numbers.stream()
                .filter(num -> num % 2 != 0 )
                .forEach(num -> System.out.printf("% d",num));
    }
}
