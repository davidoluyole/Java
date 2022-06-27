package tdd;

public class Driller {
    private int price;
    
    public int cost(int damage, int quantity) {
      //  if (quantity > 4)
        int price = damage * quantity; 
        return price;
    }

    public int cost(int quantity) {

        if (quantity <= 4) {
            return 2000 * quantity;
        }
        if (quantity <= 9) {
            return 1800 * quantity;
        }
        if (quantity <= 29) {
            return 1600 * quantity;
        }
        if (quantity <= 49) {
            return 1500 * quantity;
        }
        if (quantity <= 99) {
            return 1300 * quantity;
        }
        if (quantity <= 199) {
            return 1200 * quantity;
        }
        if (quantity <= 499) {
            return 1100 * quantity;
        }
        return 1000 * quantity;
    }
}
