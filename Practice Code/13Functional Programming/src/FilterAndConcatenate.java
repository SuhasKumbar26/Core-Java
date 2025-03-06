import java.util.List;

public class FilterAndConcatenate {
    public static void main(String[] args) {
        List<String> strings = List.of("FragranceOfJasmine",
                "JavaDeveloper", "IndianCurrency","Hello", "Java", "Developer");

        String concatenatedStr = strings.stream()
                .filter(string -> (string.length() > 10))
                .reduce("",(a,b)-> a+" "+b);

        System.out.println(concatenatedStr);
    }
}
