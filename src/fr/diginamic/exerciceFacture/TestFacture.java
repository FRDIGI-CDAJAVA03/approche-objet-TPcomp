package fr.diginamic.exerciceFacture;

import fr.diginamic.exerciceCercle.Cercle;
import mochizukiTools.Utils;

public class TestFacture {
    public static void run() {
        Utils.msgTitle("EXERCICE 3 : FACTURE");
        Utils.msgInfo("Instanciation d'une facture");
        Facture facture1 = new Facture(500);
        Utils.msgResult(facture1.toString());
        facture1.addKwh(40);
        Utils.msgResult(facture1.toString());
    }
}
