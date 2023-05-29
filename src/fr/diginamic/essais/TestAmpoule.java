package fr.diginamic.essais;

import fr.diginamic.entites.Ampoule;

public class TestAmpoule {
    public static void main(String[] args){
        Ampoule ampoule = new Ampoule();
        System.out.println("Avant «clic» : " + ampoule);
        ampoule.clic();
        System.out.println("Après «clic» : " + ampoule);
    }
}
