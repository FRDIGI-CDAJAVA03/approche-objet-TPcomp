package fr.diginamic.essais;

import fr.diginamic.entites.Date;

public class TestDates {
    public static void main(String[] args){
        Date date = new Date(6, 4, 1992);
        System.out.println(date.format(1));
    }
}
