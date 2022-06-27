package weekend;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner entered = new Scanner(System.in);
        System.out.println("please enter a Number: ");
        int variable = entered.nextInt();
        if (variable % 2 == 0 && variable!= 2) {
            System.out.println(variable + " is not a prime number");
            if (variable % 3 == 0 && variable!= 3) {
                System.out.println(variable + " is not a prime number");
                if (variable % 5 == 0 && variable!= 5) {
                    System.out.println(variable + " is not a prime number");
                }
            }
        } else {
            System.out.println(variable + " is a prime number");
        }
    }
}
