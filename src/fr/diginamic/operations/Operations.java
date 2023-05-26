package fr.diginamic.operations;

public class Operations {
    public static double calcul(double a, char op, double b){
        switch(op){
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '^':
                return Math.pow(a, b);
            default:
                throw new IllegalArgumentException("+, -, *, / and ^ operators accepted only!");
        }
    }
}
