package chapter4;

import java.text.DecimalFormat;

public class roundoff {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        double decimalNumber= 123.13698;
        System.out.println(df.format(decimalNumber));

    }
}
