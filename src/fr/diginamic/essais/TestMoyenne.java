package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args){
        CalculMoyenne m = new CalculMoyenne();
        m.ajout(1);
        m.ajout(2);
        m.ajout(3);
        System.out.println("Moyenne : " + m.calcul());
    }
}
