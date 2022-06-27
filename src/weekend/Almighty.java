package weekend;

import java.util.Scanner;

/*

1) prompt the user to enter a score;
2) if number <60 and greater than or equal to 0, print F
3) if number <70 D and greater than or equal to 60
4) if number <80 C and greater than or equal to 70
5) if number <90 B and greater than or equal to 80
6) if number is less than or equal to 100 A and greater than or equal to 90

 */

public class Almighty {

    public static void main(String... args) {

        //1. ask user to enter a number;

        Scanner result = new Scanner(System.in);
        System.out.println( "Enter a Score");
        int score = result.nextInt();

        //2. compare the number to 55;

        if ( score < 60 && score >= 0){
            System.out.println("F");
        }

        //3. print out judgement;

        if (score < 70 && score >= 60) {
            System.out.println("D");
        }

        if (score < 80 && score >= 70) {
            System.out.println("C");
        }

        if (score < 90 && score >= 80) {
            System.out.println("B");
        }

        if (score <= 100 && score >= 90) {
            System.out.println("A");
        }
    }

}
