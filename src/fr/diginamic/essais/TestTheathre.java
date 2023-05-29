package fr.diginamic.essais;

import fr.diginamic.entites.Theathre;

import java.math.BigDecimal;

public class TestTheathre {
    public static void main(String[] args) {
        Theathre theathre = new Theathre("Haskott", 5, 2);
        System.out.println(theathre);
        System.out.println(theathre.getRecetteTotal());

        theathre.inscrire(4, BigDecimal.valueOf(12.5));
        System.out.println(theathre.getTotalClient());
        System.out.println(theathre.getRecetteTotal());
        theathre.inscrire(1, BigDecimal.valueOf(12.5));
    }
}
