package fr.diginamic.entites;

public class Cercle {
    private double rayon;
    public Cercle(double rayon){
        this.rayon = rayon;
    }
    public double perimetre(){
        return 2 * Math.PI * rayon;
    }
    public double aire(){
        return Math.PI * Math.pow(rayon, 2);
    }
}
