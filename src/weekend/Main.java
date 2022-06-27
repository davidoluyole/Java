package weekend;
import java.util.Arrays;

// Array class
public class Main {
    public static void main(String[] args) {

        System.out.println();

        int[] classwork = {10, 20, 33, -6, -7};
        int sum = 0;
        int average = 0;
        int smallest = classwork[0];
        int largest = classwork[0];

        for (int i = 0; i < classwork.length; i++) {
            int sum1 = classwork[i];
            sum += sum1;

            average = sum / classwork.length;

            if (classwork[i] < smallest) {
                smallest = classwork[i];
            }

            if (classwork[i] > largest) {
                largest = classwork[i];
            }
        }
        System.out.println("the sum of the values are " + sum);
        System.out.println("the average is " + average);
        System.out.println("the smallest is " + smallest);
        System.out.println("the largest is " + largest);

            System.out.println();

            int[] myArray = new int[10];
            int[] myArray2 = {1, 2, 3, 4, 5, 6};
            String[] stringArray = new String[5];
            String[] stringArray2 = {"Hello", "world", "how"};

            System.out.println("myArray length is " + myArray.length);
            System.out.println("myArray2 length is " + myArray2.length);
            System.out.println("stringArray length is " + stringArray.length);
            System.out.println("stringArray2 length is " + stringArray2.length);
            System.out.println("myArray2 at index 3 is " + myArray2[3]);
            System.out.println("myArray2 at last index is " + myArray2[myArray2.length - 1]);
            System.out.println("stringArray2 at index 3 is " + stringArray2[2]);
            System.out.println("stringArray2 at last index is " + stringArray2[stringArray2.length - 1]);
            System.out.println(stringArray[stringArray.length - 1]);

            System.out.println();

            System.out.println("my array at 0 is" + myArray[0]);
            myArray[0] = 25;
            System.out.println("my array at 0 is " + myArray[0]);

            System.out.println("my array at is " + myArray2[1]);
            myArray2[1] = 900;
            System.out.println("my array at 1 is " + myArray2[1]);

            System.out.println();

            for (int i = 0; i < myArray2.length; i++) {
                System.out.println(myArray2[i]);
            }

            System.out.println();

            for (int i = 0; i < stringArray2.length; i++) {
                System.out.println(stringArray2[i]);
            }

            System.out.println();

            for (int i = 0; i < myArray2.length; i++) {
                myArray2[i] = myArray2[i] * 20;
            }

            System.out.println();

            for (int i = 0; i < myArray2.length; i++) {
                System.out.println(myArray2[i]);
            }

            System.out.println();

            int[] myArray3 = {1, 3, 4, 778, 341, 45, -899};
            for (int i = 0; i < myArray3.length; i++) {
                int randomIndex = (int) (Math.random() * 10);
                System.out.println("random index is " + randomIndex);
                try {
                    System.out.println("array at random index " + randomIndex + " is " + myArray3[randomIndex]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Invalid index encountered");
                }
            }

            System.out.println();

            int[] jay = {0, 1, 2, 100, 4, 5};
            //enhanced for loop
            int sums = 0;
            for (int value : jay) {
                sums += value;
            }
            System.out.println(sums);


            System.out.println();


            //pass by value
            int money = 10000;
            Stuff.Deposit(money);
            System.out.println(money);

            System.out.println();

            //pass by reference
            int[] values = {1, 2, 4, 5, 6, 7, 8, 9};
            System.out.println("main value is " + values);
            Stuff.Deposit2(values);
            System.out.println(Arrays.toString(values));
            System.out.println(values);

            //multi-dimensional arrays consists of arrays
//
//        int [][] my2dArrays = {{1,2,3},{4,5,6}};
//        int [][] my2dArrays2 = new int[2][3];
//                             {{123},{4,5,6}}
//                                    0 1 2
//                                  0 1 2 3
//                                  1 4 5 6
//  pronounced as int @ [][], [3][0] is 4. we used nested for loop and separate indexes
//        for (int row = 0; row < array.length; row++) {
//            for (int column = 0; column < array[row]length ; column++) {
//
//            }
//        }
// hotel 10 rooms(sentinel control while loop) checkin(input), checkout(remove) and ask who is at a room(return).
            // enter 1 to book a room(ask a name, put in available room, if there's no room print fully booked),
            // enter 2 to leave a room... array[1] = null, enter 3 to check details of  a room, enter -1 to exit.

            System.out.println();
            String[] hotel = new String[10];

        }
    }
