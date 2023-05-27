package fr.diginamic.essais;

import fr.diginamic.entites.Ampoule;

public class TestAmpoule {
    public static void main(String[] args) {
        Ampoule ampoule = new Ampoule();
        System.out.println(ampoule);
        ampoule.click();
        System.out.println(ampoule);

    }
}
