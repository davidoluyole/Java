package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceTest {
    Invoice invoice;


    @BeforeEach
    void setUp() {
        invoice = new Invoice();
    }


    @Test
    void addItem() {
        invoice.addItem("bible");
        assertEquals(1,invoice.getItemNames().size());
        invoice.addItem("anointing oil");
        assertEquals(2, invoice.getItemNames().size());
    }

    @Test
    void getItemName(){
        invoice.addItem("rosary");
        String item = invoice.getItemNames().get(0);
        assertEquals("rosary", item);
        invoice.addItem("anointing oil");
        String items = invoice.getItemNames().get(1);
        assertEquals("anointing oil", items);
    }

    @Test
    void addPricePerUnit() {
        invoice.addPricePerUnit(100);
        assertEquals(1, invoice.getPricePerUnit().size());
        invoice.addPricePerUnit(50);
        assertEquals(2,invoice.getPricePerUnit().size());
    }

    @Test
    void getItemPrice() {
        invoice.addPricePerUnit(100);
        assertEquals(100, invoice.getPricePerUnit().get(0));
        invoice.addPricePerUnit(50);
        assertEquals(100, invoice.getPricePerUnit().get(0));
    }

    @Test
    void addQuantity() {
        invoice.addQuantity(3);
        assertEquals(1, invoice.getQuantity().size());
        invoice.addQuantity(10);
        assertEquals(2, invoice.getQuantity().size());
    }

    @Test
    void getQuantity() {
        invoice.addQuantity(3);
        assertEquals(3, invoice.getQuantity().get(0));
        invoice.addQuantity(10);
        assertEquals(10, invoice.getQuantity().get(1));
    }

    @Test
    void incrementCounter() {
//        I put my while loop for that into an if statement
    }

    @Test
    void printItemSummary() {
        invoice.addItem("bible");
        assertEquals(1,invoice.getItemNames().size());
        String item = invoice.getItemNames().get(0);
        invoice.addItem("anointing oil");
        assertEquals(2, invoice.getItemNames().size());
        String items = invoice.getItemNames().get(1);
        invoice.addPricePerUnit(100);
        assertEquals(1, invoice.getPricePerUnit().size());
        assertEquals(100, invoice.getPricePerUnit().get(0));
        invoice.addPricePerUnit(50);
        assertEquals(2,invoice.getPricePerUnit().size());
        assertEquals(100, invoice.getPricePerUnit().get(0));
        invoice.addQuantity(3);
        assertEquals(1, invoice.getQuantity().size());
        assertEquals(3, invoice.getQuantity().get(0));
        invoice.addQuantity(10);
        assertEquals(2, invoice.getQuantity().size());
        assertEquals(10, invoice.getQuantity().get(1));
    }

    @Test
    void calculateSubTotal() {
    }

    @Test
    void calculateDiscount() {
    }

    @Test
    void calculateVat() {
    }
}
