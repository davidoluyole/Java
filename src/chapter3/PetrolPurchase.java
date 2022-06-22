package chapter3;

public class PetrolPurchase {
    private String stationLocation;
    private String petrolType;
    private int quantity;
    private double pricePerLitre;
    private double percentageDiscount;
    public PetrolPurchase(String stationLocation, String petrolType, int quantity, double pricePerLitre, double percentageDiscount){
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPurchaseAmount() {
        return ((pricePerLitre * quantity)-(pricePerLitre * quantity * percentageDiscount/100));
    }
}
