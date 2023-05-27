package fr.diginamic.operations;

import java.util.Optional;

public class Operations {
    double a;
    double b;
    char operator;

    public static double calcul(double a, double b, char operator){
        switch (operator){
            case '+' -> {return a + b;}
            case '-' -> {return a - b;}
            case '*' -> {return a * b;}
            case '/' -> {return a / b;}
            default -> {return 0.0;}
        }
    }
}
