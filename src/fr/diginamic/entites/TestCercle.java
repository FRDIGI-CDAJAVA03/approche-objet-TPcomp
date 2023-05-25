package fr.diginamic.entites;

public class TestCercle {
    public static void main(String[] args){
        Cercle c0 = new Cercle(10);
        Cercle c1 = new Cercle(17);
        System.out.printf("Périmètre 0: %f; Périmètre 1: %f\n", c0.perimetre(), c1.perimetre());
        System.out.printf("Aire 0: %f; Aire 1: %f\n", c0.aire(), c1.aire());
    }
}
