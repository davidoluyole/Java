/*

1) prompt the user to enter a number;

2) if number > 55, print pass;

3) if number < 55, print fail ;

*/



//90-100 A, 80-<90 B, 70-<80 C, 60-<70 D,<60 F





package weekend;
import java.util.*;

public class Zuba {
    private static int score;
    private static String Pass;
    private static String fail;


    public static void main(String... args) {

        //1. ask user to enter a number;

        Scanner result = new Scanner(System.in);
        System.out.println( "Enter a Score");
        int score = result.nextInt();

        //2. compare the number to 55;

        if ( score > 55){
            System.out.println("Pass");
        }

        //3. print out judgement;

        if (score < 55) {
            System.out.println("Fail");
        }
    }
}