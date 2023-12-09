package app;

import java.text.DecimalFormat;

public class Rounder {
    public static String roundRate(double rate) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(rate);
    }
}
