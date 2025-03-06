import java.util.Optional;

public class optionalString {
    public static void main(String[] args) {
        System.out.println(stringReturn(null));
        System.out.println(stringReturn("JavaDeveloper"));
        System.out.println(stringReturn(""));
    }

    public static Optional<String> stringReturn(String str){
        if (str == null || str.isEmpty() /* "" */){
            return Optional.empty();
        }

        return Optional.of(str.toUpperCase());
    }
}
