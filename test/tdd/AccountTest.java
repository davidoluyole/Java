package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test //@test makes code executable if we put// before @test
    public void accountCanBeCreatedTest(){
        //given i have created an account
        Account nepaAccount = new Account(); //if we see red, stop coding and address the error, hover around red  to know the error
        //when i check my balance
        int balance = nepaAccount.getBalance();
        //confirm that my balance is zero
        assertEquals(0, balance); //assertEquals is the most used assertion
    }
    @Test
    public void depositMoneyTest(){
        //given i have an account
        Account davidAccount = new Account();
        //when i deposit money
        davidAccount.deposit(1_500); //signature should be, public void deposit(int money);
        //check if my balance has changed
        assertEquals(1500, davidAccount.getBalance());
    }

    @Test
    public void depositTwiceTest(){
        Account uselessAccount = new Account();
        uselessAccount.deposit( 1_500);
        uselessAccount.deposit( 2_000);

        assertEquals(3_500, uselessAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit negative amount should not change balance test")
    public void depositNegativeAmountTest(){
        //given i have an account
        Account daveyAccount = new Account();
        //when i deposit money negative
        daveyAccount.deposit(-2_000);
        //check that my balance doesn't change
        assertEquals( 0,daveyAccount.getBalance());
    }

    @Test
    public void withdrawAmountTest(){
        //given i have an account
        Account withdrawalAccount = new Account();
        //when i withdraw money
        withdrawalAccount.withdraw(2000);
        //check that that my balance changes
        assertEquals(0, withdrawalAccount.getBalance());
    }

    @Test
    public void withdrawDepositedAmountTest() {
        //given i have an account
        Account withdrawAccount = new Account();
        //when i deposit and withdraw money
        withdrawAccount.deposit(3000);
        withdrawAccount.withdraw(2000);
        //check that that my balance changes
        assertEquals(1000, withdrawAccount.getBalance());
    }

    @Test
    public void withdrawNegativeAmountTest() {
        //given i have an account
        Account withdrawAccount = new Account();
        //when i deposit and withdraw negative balance
        withdrawAccount.deposit(3000);
        withdrawAccount.withdraw(-2000);
        //check that that my balance changes
        assertEquals(3000, withdrawAccount.getBalance());
    }
}
