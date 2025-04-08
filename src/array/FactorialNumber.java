public class FactorialNumber {

    public static void main(String[] args) {

        int n =10;

        int result = findFactorial(n);
        System.out.println("Factorial of " + n + " is: " + result);

    }
    public static int findFactorial(int n){
        if (n == 1) return 1;
        return n * findFactorial(n - 1);
    }

    }



