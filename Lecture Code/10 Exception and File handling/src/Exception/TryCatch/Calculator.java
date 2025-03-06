package Exception.TryCatch;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scan.nextInt();
        System.out.print("Enter second number: ");
        int second = scan.nextInt();

        try {
            int[] arr = new int[5];
            //System.out.printf("result is %d: ", arr[6]);
            arr[6] = first / second;
            System.out.printf("result is %d: ", arr[6]);
        } /*catch (ArithmeticException exception){
            System.out.printf(" %s, enter valid number",exception.getMessage());
        } */ catch (Throwable th){
            System.out.println("General exception");
            throw th; //throw
        }
    }
}
