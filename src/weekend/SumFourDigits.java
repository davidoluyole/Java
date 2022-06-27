package weekend;
import java.util.Scanner;

public class SumFourDigits {
    public static void main (String[] args){
        Scanner digits = new Scanner(System.in);
        System.out.println("Please enter four digits: ");

        int a = digits.nextInt();
        int b = digits.nextInt();
        int c = digits.nextInt();
        int d = digits.nextInt();

        int e = a + b + c + d;

        System.out.printf("The sum of the four digits is %d\n", e);

    }

}
