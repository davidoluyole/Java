package weekend;
import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        int positives = 0;
        int zeroes = 0;
        int negatives = 0;

        Scanner numbers = new Scanner(System.in);
        String output = """
                        Enter one of your numbers or enter -111 if you're done  
                        """;
        System.out.println(output);
        int entered = numbers.nextInt();
        while (entered != -111){
                if(entered > 0){
                   positives += 1;
                }
                if(entered == 0){
                    zeroes +=1;
                }
                if (entered < 0){
                    negatives += 1;
                }

            System.out.println(output);
            entered = numbers.nextInt();
            }
        System.out.println(positives +" Positive numbers were inputted");
        System.out.println(zeroes +" zeroes were inputted");
        System.out.println(negatives +" Negative numbers were inputted");
    }
}
