import java.util.function.BinaryOperator;

public class LambdaSum {
    public static void main(String[] args) {
        BinaryOperator<Integer> multi = (a,b) -> a * b;

        int result = multi.apply(3,4);
        System.out.println("Result is: "+result);
    }
}
