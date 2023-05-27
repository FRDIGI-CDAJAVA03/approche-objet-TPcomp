package fr.diginamic.utils;

import java.text.DecimalFormat;

public class CercleFactory {
    static DecimalFormat decfor = new DecimalFormat("0.00");
    private static final double PI = Math.PI;

    public static String createCercle(double rayon){
        double v = 2 * PI * Math.pow(rayon, 2);
        return decfor.format(v);
    }
}
