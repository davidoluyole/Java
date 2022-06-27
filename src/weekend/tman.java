package weekend;

import java.util.Scanner;

public class tman {


    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 50;
        Scanner scanner= new Scanner(System.in);
        int entry = scanner.nextInt();

//        if (x > y) {
//            System.out.println("go ahead");;
//        } else if (x<z) {
//            System.out.println("stop now");
//        } else if (z>y) {
//            System.out.println("life is good");
//        }
        switch (entry) {
            case 10:
                boolean b = x > y;
                System.out.println(b + " " + "go ahead");
                break;
            case 20:
                boolean c = x < z;
                System.out.println(c + " " + "stop now");
                break;
            case 50:
                boolean d = z > y;
                System.out.println(d + " " + "life is good");
                break;
        }

    }
}
