package fr.diginamic.essais;

import fr.diginamic.entites.Facture;
import java.lang.System;

public class TestFacture {
    public static void main(String[] args){
        Facture facture = new Facture(123.3);
        System.out.println("Facture : " + facture);
        facture.addKwh(137.75);
        System.out.println("Facture cumulée : " + facture);
    }
}
