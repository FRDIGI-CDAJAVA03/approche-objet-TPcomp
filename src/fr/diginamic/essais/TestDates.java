package fr.diginamic.essais;

import fr.diginamic.entites.Date;

public class TestDates {
    public static void main(String[] args) {
        Date date = new Date(26, 5, 2021);
        String format1 = date.format(1);
        System.out.println(format1);
        String format2 = date.format(2);
        System.out.println(format2);
        String format3 = date.format(3);
        System.out.println(format3);

        boolean b = date.estAvant();
        System.out.println(b);
        boolean b1 = date.estApres();
        System.out.println(b1);
        boolean b2 = date.estEgale();
        System.out.println(b2);

    }
}
