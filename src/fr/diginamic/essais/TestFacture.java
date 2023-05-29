package fr.diginamic.essais;

import fr.diginamic.entites.Facture;

public class TestFacture {
    public static void main(String[] args) {
        Facture facture = new Facture(40);
        System.out.println(facture);
        facture.addKwh(20);
        System.out.println(facture);
    }
}
