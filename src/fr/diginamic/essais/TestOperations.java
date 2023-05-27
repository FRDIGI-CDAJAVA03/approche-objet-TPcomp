package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        double calculAddition = Operations.calcul(4.0, 5.0, '+');
        System.out.println(calculAddition);

        double calculSoustration = Operations.calcul(4.0, 5.0, '-');
        System.out.println(calculSoustration);

        double calculMultiplication = Operations.calcul(4.0, 5.0, '*');
        System.out.println(calculMultiplication);

        double calculDivision = Operations.calcul(4.0, 5.0, '/');
        System.out.println(calculDivision);

        double calculDivException = Operations.calcul(4.0, 0.0, '/');
        System.out.println(calculDivException);
    }
}
