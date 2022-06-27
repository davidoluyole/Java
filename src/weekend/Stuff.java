package weekend;

public class Stuff {
    public static void Deposit(int money) {
        money = money * 10;
        System.out.println("money is now " + money);
    }

    public static void Deposit2(int[] values) {

        System.out.println("main value is "+ values);
        values[0] = 78;
        values[values.length-1]=89;

        //in java every primitive type is passed by value because pass by reference changes the value
        //reference types are passed by reference, the only way to avoid change is by cloning.
    }
}
