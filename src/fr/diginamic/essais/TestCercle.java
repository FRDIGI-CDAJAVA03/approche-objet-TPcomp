package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;

public class TestCercle {
    public static void main(String[] args) {
        Cercle cercle1 = new Cercle(5);
        Cercle cercle2 = new Cercle(10);

        System.out.println("Le périmetre du cercle de rayon " + cercle1.getRayon() + " est : " + cercle1.perimetre());

        System.out.println("La surface du cercle de rayon " + cercle1.getRayon() + " est : " + cercle1.surface());

        System.out.println("Le périmetre du cercle de rayon " + cercle2.getRayon() + " est : " + cercle2.perimetre());

        System.out.println("La surface du cercle de rayon " + cercle2.getRayon() + " est : " + cercle2.surface());

    }
}
