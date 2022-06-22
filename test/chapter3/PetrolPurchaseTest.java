package chapter3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetrolPurchaseTest {

    @Test
    public void petrolStationLocationTest() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Ajah", "PMS", 50, 185, 2);
        String stationLocation = petrolPurchase.getStationLocation();
        assertEquals("Ajah", stationLocation);
    }
    @Test
    public void newPetrolStationLocationTest() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Ajah", "PMS", 50, 185, 2);
        petrolPurchase.setStationLocation("Ikeja");
        assertEquals("Ikeja", petrolPurchase.getStationLocation());
    }
    @Test
    public void newPetrolTypeTest() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Ajah", "PMS", 50, 185, 2);
        petrolPurchase.setPetrolType("Diesel");
        assertEquals("Diesel", petrolPurchase.getPetrolType());
    }
    @Test
    public void petrolTypeTest() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Ajah", "PMS", 50, 185, 2);
        String petrolType = petrolPurchase.getPetrolType();
        assertEquals("PMS", petrolType);
    }
    @Test
    public void newPetrolQuantityTest() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Ajah", "PMS", 50, 185, 2);
        petrolPurchase.setQuantity(30);
        assertEquals(30, petrolPurchase.getQuantity());
    }
    @Test
    public void petrolQuantityTest() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Ajah", "PMS", 50, 185, 2);
        int quantity = petrolPurchase.getQuantity();
        assertEquals(50, quantity);
    }
    @Test
    public void newPetrolPricePerLitreTest() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Ajah", "PMS", 50, 185, 2);
        petrolPurchase.setPricePerLitre(250);
        assertEquals(250, petrolPurchase.getPricePerLitre());
    }
    @Test
    public void petrolPricePerLitreTest() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Ajah", "PMS", 50, 185, 2);
        double pricePerLitre = petrolPurchase.getPricePerLitre();
        assertEquals(185, pricePerLitre);
    }
    @Test
    public void newPetrolPercentageDiscountTest() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Ajah", "PMS", 50, 185, 2);
        petrolPurchase.setPercentageDiscount(7.5);
        assertEquals(7.5, petrolPurchase.getPercentageDiscount());
    }
    @Test
    public void petrolPercentageDiscountTest() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Ajah", "PMS", 50, 185, 2);
        double percentageDiscount = petrolPurchase.getPercentageDiscount();
        assertEquals(2, percentageDiscount);
    }
    @Test
    public void PurchaseAmountTest() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Ajah", "PMS", 50, 185, 2);
        double purchaseAmount = petrolPurchase.getPurchaseAmount();
        assertEquals(9065, purchaseAmount);
    }
}
