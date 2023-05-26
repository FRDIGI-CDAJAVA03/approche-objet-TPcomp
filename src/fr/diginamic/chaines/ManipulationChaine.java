package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

import java.util.Arrays;

public class ManipulationChaine {
    public static void main(String[] args){
        final String chaine = "Durand;Marcel;2 523.5";
        System.out.println("Première chaîne : " + chaine.charAt(0));
        System.out.println("Longueur de chaîne : " + chaine.length());
        final int FIRST_INDEX = chaine.indexOf(';');
        System.out.println("Indice premier de «;» : " + FIRST_INDEX);
        final int SECOND_INDEX = chaine.indexOf(';', FIRST_INDEX + 1);
        System.out.println("Prénom : " +
                chaine.substring(FIRST_INDEX + 1, SECOND_INDEX));
        final String LASTNAME = chaine.substring(0, FIRST_INDEX);
        System.out.println("Avec nom capitalisé : " +
                chaine.replace(LASTNAME, LASTNAME.toUpperCase()));
        final String FIRSTNAME = chaine.substring(FIRST_INDEX + 1, SECOND_INDEX);
        System.out.println("Avec prénom décapitalisé : " +
                chaine.replace(FIRSTNAME, FIRSTNAME.toLowerCase()));
        System.out.println("Tableau des cellules : " + Arrays.toString(chaine.split(";")));
        final String SALARY = chaine.substring(SECOND_INDEX + 1, chaine.length()).replaceAll(" ", "");
        Salarie salarie = new Salarie(LASTNAME,
                FIRSTNAME,
                Double.parseDouble(SALARY));
        System.out.println(salarie);
    }
}
