package weekend;
import java.util.Scanner;

public class Powers {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        String prompt = """
                Please enter two(2) numbers
                """;
        System.out.println(prompt);

        int number = entry.nextInt();
        int power = entry.nextInt();
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println(number + " raised to power " + power +" is " + result);
    }
}
