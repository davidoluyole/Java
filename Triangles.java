package tdd;

public class Triangles {
    public static void main (String[]args){
        //triangle iv
        for (int column = 1; column <= 5; column++) {
            for (int firstTriangle = column; firstTriangle <= 5; firstTriangle++) {
                System.out.print(" ");
            }
            for (int secondTriangle = 1; secondTriangle <= column; secondTriangle++) {
                System.out.print("*");
            }
            for (int thirdTriangle = 1; thirdTriangle < column; thirdTriangle++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //triangle v
        for (int column = 1; column <= 5; column++) {
            for (int firstTriangle = column; firstTriangle <= 5; firstTriangle++) {
                System.out.print(" ");
            }
            for (int secondTriangle = 1; secondTriangle <= column; secondTriangle++) {
                System.out.printf("%d", column);
            }
            for (int thirdTriangle = 1; thirdTriangle < column; thirdTriangle++) {
                System.out.printf("%d", column);
            }
            System.out.println();
        }

        //triangle vi
        for (int column = 1, p = 1; column <= 5; column++, p++) {
            for (int firstTriangle = column; firstTriangle <= 5; firstTriangle++) {
                System.out.print(" ");
            }
            int s=p;
            for (int secondTriangle = 1; secondTriangle < column; secondTriangle++) {
                System.out.print(s--);
            }
            int q=1;
            for (int thirdTriangle = 1; thirdTriangle <= column; thirdTriangle++) {
                System.out.print(q++);
            }
            System.out.println();
        }
    }
}
