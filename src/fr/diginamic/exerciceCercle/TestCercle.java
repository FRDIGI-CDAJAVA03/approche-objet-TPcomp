package fr.diginamic.exerciceCercle;

import mochizukiTools.Utils;

public class TestCercle {

    public static void run() {
        Utils.msgTitle("EXERCICE 2 : CERCLE");
        Utils.msgInfo("Instanciation de 2 cercles:");

        Cercle cercle1 = new Cercle(5.52);
        double rayonCercle1 = cercle1.getRayon();
        String strMsg = String.format("Cercle1 => rayon: %.4f  périmètre: %.4f     surface: %.4f",rayonCercle1,cercle1.setPerimetre(rayonCercle1),cercle1.setSurface(rayonCercle1));
        Utils.msgResult(strMsg);

        Cercle cercle2 = new Cercle(18.456);
        double rayonCercle2 = cercle2.getRayon();
        strMsg = String.format("Cercle2 => rayon: %.4f  périmètre: %.4f     surface: %.4f",rayonCercle2,cercle2.setPerimetre(rayonCercle2),cercle1.setSurface(rayonCercle2));
        Utils.msgResult(strMsg);
    }
}
