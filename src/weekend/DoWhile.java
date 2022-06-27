package weekend;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int repetition =0;
        Scanner entry = new Scanner(System.in);

        System.out.println("Please Enter Two(2) numbers ");
        double entered = entry.nextDouble();

        double enteredAgain = entry.nextDouble();

        do {
            for (repetition = 0; repetition < 1; repetition++) {
                double output = entered + enteredAgain;
                System.out.println(output);
                repetition++;

                System.out.println("Please Enter Two(2) numbers or -1 twice to quit");
                entered = entry.nextDouble();
                enteredAgain = entry.nextDouble();
            }
        }while (entered != -1); {

        }
    }
}
