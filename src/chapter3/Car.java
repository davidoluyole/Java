package chapter3;

public class Car {
    String model;
    String year;
    double price;
    double discount;
    public Car (String model, String year, double price){
        this.model = model;
        this.year = year;
        if (price>=0.0)
        this.price = price;

    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPrice(double price) {
        if (price>0.0)
            this.price = price;
    }


    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void applyDiscount(double discount) {
        if (discount>0.0)
            this.price = price - (price*discount/100);
    }
}
