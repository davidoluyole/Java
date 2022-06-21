package chapter3;// Fig. 3.9: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.
import java.util.Scanner;

public class Answer3_15 {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

// display initial balance of each object
        displayAccount(account1);
        displayAccount(account2);

// deposit into account1
        depositMoney(account1);

// display balances
        displayAccount(account1);
        displayAccount(account2);

// deposit into account2
        depositMoney(account2);

// display balances
        displayAccount(account1);
        displayAccount(account2);
    }
    public static void displayAccount(Account accountToDisplay){
        System.out.printf("%s balance: $ %.2f%n", accountToDisplay.getName(),
                accountToDisplay.getBalance());
    }

    public static void depositMoney(Account accountToDeposit) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter deposit amount for account1: "); // prompt
        double depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nAdding %.2f to account1 balance%n%n",
                depositAmount);
        accountToDeposit.deposit(depositAmount); // add to account1’s balance

    }
}