package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

import java.util.Arrays;

public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne tabCalc = new CalculMoyenne();
        tabCalc.setTableauDouble(new double[]{1.0});
        double[] tableau = tabCalc.getTableauDouble();
        double[] tableau1 = tabCalc.ajout(tableau, 2.0);
        double[] tableau2 = tabCalc.ajout(tableau1, 3.0);
        double[] tableau3 = tabCalc.ajout(tableau2, 4.0);
        double[] tableau4 = tabCalc.ajout(tableau3, 5.0);

        tableau = tableau4;

        System.out.println(Arrays.toString(tableau));
        System.out.println(Arrays.toString(tabCalc.getTableauDouble()));

        double v = tabCalc.calculMoyenn();
        System.out.println(v);


    }
}
