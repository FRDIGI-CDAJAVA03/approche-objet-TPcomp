package fr.diginamic.essais;

import fr.diginamic.entites.Date;

public class TestDates {
    final static String redString = "\u001b[33m";
    final static String resetString = "\u001b[0m";
    public static void main(String[] args){
        Date date = new Date(6, 4, 1992);
        System.out.println(date.format(1));
        Date dateBis = new Date(2, 3, 1961);
        System.out.println(date.format(1) +
                (dateBis.estApres(date) ? " est après " : " est avant ") +
                dateBis.format(1));
    }
}
