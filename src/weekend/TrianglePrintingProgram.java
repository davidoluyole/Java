package weekend;

public class TrianglePrintingProgram {
    public static void main(String[] args) {

        //right-angled triangle
        for (int column = 1; column <= 10; column++) {
            for (int row = 1; row <= column; row++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //inverted right-angled triangle
    System.out.println();

        for (int column = 1; column <= 10; column++) {
            for (int row = column; row <= 10; row++) {
                    System.out.print("* ");
            }
                System.out.println();
        }

    System.out.println();
        //flipped right-angled triangle
        for (int column = 1; column <= 10; column++) {
            for (int row = column; row <= 10; row++) {
                System.out.print("  ");
            }
            for (int row = 1; row <= column; row++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    System.out.println();

    //inverted flipped right-angled triangle
        for (int column = 1; column <=10; column++) {
            for (int row = 1; row <= column; row++){
                System.out.print("  ");
            }
            for (int row = column; row <= 10; row++){
                System.out.print("* ");
            }
            System.out.println();
        }

    System.out.println();

    }
}