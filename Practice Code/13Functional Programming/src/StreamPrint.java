import java.util.List;

public class StreamPrint {
    public static void main(String[] args) {
        List<String> names = List.of("Hello", "Java", "Developers","How", "Are", "You", "All..?");

        names.stream().forEach(name -> System.out.print(name+" "));
    }
}
