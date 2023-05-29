package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class TestCercle {
    public static void main(String[] args){
        Cercle circle = CercleFactory.buildCircle(23);
        System.out.println(circle);
    }
}
