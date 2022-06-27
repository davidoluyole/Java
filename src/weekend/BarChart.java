package weekend;
import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        System.out.println("Enter five numbers between 1 and 30");
        Scanner number = new Scanner(System.in);

        int number1= number.nextInt();
        int number2= number.nextInt();
        int number3= number.nextInt();
        int number4= number.nextInt();
        int number5= number.nextInt();

        for (int i = 0; i < 1; i++) {
            for (int j = 1; j <= number1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
            for (int k = 0; k < number2; k++) {
                System.out.print("* ");
            }
            System.out.println("");
            for (int l = 0; l < number3; l++) {
                System.out.print("* ");
            }
            System.out.println("");
            for (int m = 0; m < number4; m++) {
                System.out.print("* ");
            }
            System.out.println("");
            for (int n = 0; n < number5; n++) {
                System.out.print("* ");
            }
            System.out.print("");
        }
    }
}
