package weekend;
import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int maximum=0;
        int minimum=1000000000;
        Scanner entered = new Scanner(System.in);
        String output = """
                Enter a positive integer or enter -111 to indicate end of input
                """;
        System.out.println(output);
        int entry = entered.nextInt();

        while (entry!= -111){
            if (entry > maximum){
                maximum = entry;
            }
            if (entry < minimum){
                minimum = entry;
            }
            System.out.println(output);
            entry = entered.nextInt();
        }
        System.out.println("The Smallest number entered is " +minimum+ " The Largest number entered is " +maximum);
    }
}
