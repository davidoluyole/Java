package tdd;
import java.util.Scanner;
import java.lang.Math;

public class RandomNumberGenerator {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        int number = (int) (Math.random() * 100+1);

        System.out.println("Guess what the generated Number is: ");
        int guess = entry.nextInt();

        if (guess == number) {
        }
        else while (guess != number){
            if (guess < number){
                System.out.println("Too low, Try again");
            }
            if (guess > number){
                System.out.println("Too high, Try again");
            }
 //               break;
            System.out.println("Guess what the generated Number is: ");
            guess = entry.nextInt();
        }
        System.out.println("Correct!");
    }
}
