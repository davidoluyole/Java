package chapter9.tdd;

public class Account {

    public Account(int number, String name, String pin) {
        this.name = name;
        this.number = number;
    }

    public String getAccountName() {
        return name;


    }

    private String name;
    private int number;

    public int getAccountNumber() {
        return number;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    private int balance;

    public int getBalance() {
        return balance;
    }

    private String pin;

    public void withdraw(int amount, String pin) {
            if(pin.equals(pin))    {
        balance -= amount;
    }
}
}
