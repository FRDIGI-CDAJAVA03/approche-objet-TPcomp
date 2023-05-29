package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;

public class TestCercle {
    public static void main(String[] args) {
        Cercle cercle1 = new Cercle(11);
        Cercle cercle2 = new Cercle(14);

        System.out.println("Perimètre cercle1 = " + cercle1.perimetre());
        System.out.println("Surface cercle1 = " + cercle1.surface());
        System.out.println("Perimètre cercle2 = " + cercle2.perimetre());
        System.out.println("Surface cercle2 = " + cercle2.surface());

    }
}
