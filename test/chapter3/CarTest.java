package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    Car bmw;
    @BeforeEach
    void setUp(){
        bmw = new Car("3 Series", "2013", 7_000_000);
    }

    @Test
    void modelTest() {
        assertEquals("3 Series", bmw.getModel());
    }
    @Test
    void yearTest() {
        assertEquals("2013", bmw.getYear());
    }
    @Test
    void priceTest() {
        assertEquals(7_000_000, bmw.getPrice());
    }
    @Test
    void setModelTest() {
        bmw.setModel("7 Series");
        assertEquals("7 Series", bmw.getModel());
    }
    @Test
    void setYearTest() {
        bmw.setYear("2020");
        assertEquals("2020", bmw.getYear());
    }
    @Test
    void setPriceTest(){
        bmw.setPrice(12_000_000);
        assertEquals(12_000_000, bmw.getPrice());
    }
    @Test
    void applyDiscount(){
        bmw.applyDiscount(10);
    }
    @Test
    void twoCarObjectCreationTest(){
        Car audi = new Car("A8", "2020", 100_000_000);
        assertEquals(100_000_000, audi.getPrice());
        audi.applyDiscount(5);
        assertEquals(95_000_000, audi.getPrice());
        Car benz = new Car("c-class", "2015", 10_000_000);
        assertEquals(10_000_000, benz.getPrice());
        benz.applyDiscount(7);
        assertEquals(9_300_000, benz.getPrice());
    }
}
