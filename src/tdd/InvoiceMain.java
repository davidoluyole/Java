package tdd;

import java.util.Objects;
import java.util.Scanner;

public class InvoiceMain {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        Invoice invoice = new Invoice();
        int sentinel = 1;

        System.out.println("What is the customer's Name?");
        String name = answer.nextLine();
        while (sentinel != -1) {
            System.out.println("what did the user buy?");
            String item = answer.nextLine();
            invoice.addItem(item);

            System.out.println("How many pieces?");
            int quantity = answer.nextInt();
            invoice.addQuantity(quantity);

            System.out.println("How much per unit?");
            int price = answer.nextInt();
            invoice.addPricePerUnit(price);

            invoice.incrementCounter();

            System.out.println("Add more items? enter yes or no");
            String userValue = answer.next();
            answer.nextLine();

            if (Objects.equals(userValue, "no")) {
                sentinel = -1;
            }
        }


        System.out.println("What is your name?");
        String Cashier = answer.nextLine();


        System.out.println("How much discount will he get");
        double discount = answer.nextDouble();
        invoice.setPercentageDiscount(discount);


        String output = """
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION:312, HERBERT MACAULAY WAY, SABO YABA, LAGOS
                TEL: 03293828343
                DATE:
                Cashier:
                Customer Name:
                ====================================================
                        ITEM        QTY        PRICE      TOTAL(NGN)
                ----------------------------------------------------
                """;

        System.out.println(output);
//        int numberOfItems = invoice.getCounter();

//        for (int index = 0; index < numberOfItems; index++) {
//            String summary = invoice.printItemSummary(index);
//            System.out.println("            " + summary);
//        }
        String individualSummary = invoice.printItemSummary();
        System.out.println(individualSummary);

        System.out.println("----------------------------------------------------");
        double total = invoice.calculateSubTotal();
        System.out.println("                                Sub Total:" + total);
        discount = invoice.calculateDiscount(total);
        System.out.println("                                 Discount:" + discount);
        double vat = invoice.CalculateVat();
        System.out.println("                                 VAT @ 17.5%:" + vat);
        System.out.println("====================================================");
        double billTotal = total - discount + vat;
        System.out.println("Bill Total: " + billTotal);
        System.out.println("====================================================");
        System.out.println("THis is not a receipt Kindly pay" + billTotal);

        System.out.println("How much did he/she give you?");
        int amountPaid = answer.nextInt();

        System.out.println(output);
        System.out.println("----------------------------------------------------");
        System.out.println(individualSummary);
        System.out.println("----------------------------------------------------");
        System.out.println("Sub Total:" + total);
        System.out.println("Discount:" + discount);
        System.out.println("VAT @ 17.5%:" + vat);
        System.out.println("====================================================");
        System.out.println("Bill Total:" + billTotal);
        System.out.println("Amount Paid:" + amountPaid);
        double balance = amountPaid - billTotal;
        System.out.println("Balance:" + balance);
        System.out.println("====================================================");
        System.out.println("Thank you for your patronage");
        System.out.println("====================================================");


    }
}
