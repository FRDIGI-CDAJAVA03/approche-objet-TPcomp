package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args){
        double nbr = Operations.calcul(12, '+',13);
        nbr = Operations.calcul(nbr, '-', 1);
        nbr = Operations.calcul(6, '/', nbr);
        nbr = Operations.calcul(nbr, '*', 4);
        nbr = Operations.calcul(nbr, '^', -2);
        System.out.println("Verdict : " + nbr);
    }
}
