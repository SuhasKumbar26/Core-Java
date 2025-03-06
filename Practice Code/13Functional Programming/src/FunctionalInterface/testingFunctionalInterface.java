package FunctionalInterface;


public class testingFunctionalInterface {
    public static void main(String[] args) {

        Candidate candidate = number -> {
            for (int i  = 2; i < number; i++){
                if (number % i == 0 ){
                    return false;
                }
            }
            return true;
        };

        boolean isPrime = candidate.isPrime(4);
        System.out.println(isPrime);
    }
}
