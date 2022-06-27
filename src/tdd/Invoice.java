package tdd;

import java.util.ArrayList;
import java.util.Collection;

public class Invoice {
    private String CustomerName;
    private ArrayList<String> itemNames;
    private ArrayList<Double> pricePerUnit;
    private ArrayList<Integer> quantity;
    private double percentageDiscount;
    private int counter = 0;

    public int getCounter() {
        return counter;
    }


    public Invoice() {
        itemNames = new ArrayList<>();
        pricePerUnit = new ArrayList<>();
        quantity = new ArrayList<>();
        percentageDiscount = 0;
    }

    public void addItem(String itemName) {
        itemNames.add(itemName);
    }

    public ArrayList<String> getItemNames() {
        return itemNames;
    }

    public void addPricePerUnit(double price) {
        pricePerUnit.add(price);
    }

    public ArrayList<Double> getPricePerUnit() {
        return pricePerUnit;
    }

    public void addQuantity(int units) {
        quantity.add(units);
    }

    public ArrayList<Integer> getQuantity() {
        return quantity;
    }


    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double discount) {
        percentageDiscount = discount;
    }

    public void incrementCounter() {
        counter += 1;
    }

    public String printItemSummary() {
        String summary = "";
        int numberOfItems = getCounter();
        for (int index = 0; index < numberOfItems; index++) {
            String itemName = itemNames.get(index);
            double ppu = pricePerUnit.get(index);
            int qty = quantity.get(index);
            String individualSummary = itemName + "    " + qty + "  " + ppu + "    " + (ppu * qty) + "\n";
            summary += individualSummary;

        }
        return summary;
    }

    public double calculateSubTotal() {
        double total = 0;
        for (int index = 0; index < counter; index++) {
            total += quantity.get(index) * pricePerUnit.get(index);
        }
        return total;
    }

    public double calculateDiscount(double total) {
        double discountAmount = (total * percentageDiscount) / 100;
        return discountAmount;
    }

    public double CalculateVat() {
        double total = 0;
        double vat = 0;
        for (int index = 0; index < counter; index++) {
            total += quantity.get(index) * pricePerUnit.get(index);
        }
        vat = (total * 17.5) / 100;
        return vat;
    }
}

//look into string formatting to arrange
