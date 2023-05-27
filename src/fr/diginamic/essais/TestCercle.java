package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {
    public static void main(String[] args) {
        Cercle cercle1 = new Cercle(5);
        Cercle cercle2 = new Cercle(10);

        System.out.printf("Le périmetre du cercle de rayon %s est : %s %n", cercle1.getRayon(), cercle1.perimetre());

        System.out.printf("La surface du cercle de rayon %s est : %s %n", cercle1.getRayon(), cercle1.surface());

        System.out.println("Le périmetre du cercle de rayon " + cercle2.getRayon() + " est : " + cercle2.perimetre());

        System.out.println("La surface du cercle de rayon " + cercle2.getRayon() + " est : " + cercle2.surface());

        String cercle3 = CercleFactory.createCercle(4.5);
        System.out.println(("Creation de la surface d'un cercle avec " +
                "la méthode statique de CercleFactory : %s").formatted(cercle3));

    }
}
