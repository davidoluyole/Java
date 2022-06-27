package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    @Test
    public void additionTest(){
        Kata calculator = new Kata();
        int sum = calculator.add(2, 6);
        assertEquals(8, calculator.add(2,6));
        assertEquals(66, calculator.add(54,12));
    }
    @Test
    public void subtractionTest(){
        Kata calculator = new Kata();
        int result = calculator.subtract(4,2);
        assertEquals(2, calculator.subtract(4,2));
    }

    @Test
    public void absoluteSubtractionTest(){
        Kata calculator = new Kata();
        int result = calculator.subtract(2,4);
        assertEquals(2, result);
    }
    //quotient, o as second argument returs zero
    //product
    @Test
    public void quotientTest(){
        Kata calculator = new Kata();
        int result = calculator.quotient(8,3);
        assertEquals(2, result);
    }
    @Test
    public void zeroQuotient(){
        Kata calculator = new Kata();
        int result = calculator.quotient(10, 0);
        assertEquals(0, result);
    }
    @Test
    public void productTest(){
        Kata calculator = new Kata();
        int result = calculator.product(2, 3);
        assertEquals(6, result);
    }
}
