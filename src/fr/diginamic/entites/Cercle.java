package fr.diginamic.entites;

import java.text.DecimalFormat;

public class Cercle {
    private static final double PI = Math.PI;
    double rayon;

    DecimalFormat decfor = new DecimalFormat("0.00");

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public String perimetre() {
        double num = PI * rayon * 2;
        return decfor.format(num);
    }

    public String surface() {
        double num = 2 * PI * Math.pow(rayon, 2);
        return decfor.format(num);
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public String toString() {
        return "Cercle " +
                "rayon=" + rayon;
    }
}
