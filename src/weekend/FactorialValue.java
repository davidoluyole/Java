package weekend;
import java.util.Scanner;

public class FactorialValue {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");

        int number = input.nextInt();
        int count;
        int factorial = 1;

        for (count = 1; count<=number ;count++) {
            factorial = factorial * count;
        }
        System.out.printf("the Factorial value of %d is %d", number, factorial);
    }
}
