package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrillerTest {
    @Test
    public void TestDriller() {
        //Given that i purchase a copy
        Driller copy = new Driller();
        //when i purchase a copy
        int price = copy.cost(4);
        //check that price is 2_000
        assertEquals(8000, price);
    }
    @Test
    public void TestDriller2() {
        //Given that i purchase a copy
        Driller copy = new Driller();
        //when i purchase a copy
        int price = copy.cost(9);
        //check that price is 2_000
        assertEquals(16200, price);
    }
    @Test
    public void TestDriller3() {
        //Given that i purchase a copy
        Driller copy = new Driller();
        //when i purchase a copy
        int price = copy.cost(29);
        //check that price is 2_000
        assertEquals(46400, price);
    }
    @Test
    public void TestDriller4() {
        //Given that i purchase a copy
        Driller copy = new Driller();
        //when i purchase a copy
        int price = copy.cost(49);
        //check that price is 2_000
        assertEquals(73500, price);
    }
    @Test
    public void TestDriller5() {
        //Given that i purchase a copy
        Driller copy = new Driller();
        //when i purchase a copy
        int price = copy.cost(99);
        //check that price is 2_000
        assertEquals(128700, price);
    }
    @Test
    public void TestDriller6() {
        //Given that i purchase a copy
        Driller copy = new Driller();
        //when i purchase a copy
        int price = copy.cost(199);
        //check that price is 2_000
        assertEquals(238800, price);
    }
    @Test
    public void TestDriller7() {
        //Given that i purchase a copy
        Driller copy = new Driller();
        //when i purchase a copy
        int price = copy.cost(499);
        //check that price is 2_000
        assertEquals(548900, price);
    }
    @Test
    public void TestDriller8() {
        //Given that i purchase a copy
        Driller copy = new Driller();
        //when i purchase a copy
        int price = copy.cost(500);
        //check that price is 2_000
        assertEquals(500000, price);
    }
}