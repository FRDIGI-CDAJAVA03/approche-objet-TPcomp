package fr.diginamic.essais;

import fr.diginamic.entites.Facture;

public class TestFacture {
    public static void main(String[] args) {
        Facture facture1 = new Facture(10);
        System.out.println(facture1);
        facture1.addKwh(10);
        System.out.println(facture1);
    }
}
