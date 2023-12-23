package basicMaths;



import java.util.Scanner;

public class countDigits {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        System.out.println("");

        int count = 0;
        int digit = 0;
        int temp = n;

        while (temp > 0) {

            digit = temp % 10;
            if (digit != 0) {
                if (n % digit == 0) {
                    count++;
                }
            }
            temp=temp/10;

        }
        System.out.println(count);
    }
}

// input =336
// output= 3