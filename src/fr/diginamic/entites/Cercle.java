package fr.diginamic.entites;

public class Cercle {
    private final double RAYON;
    public Cercle(double RAYON){
        this.RAYON = RAYON;
    }
    public double perimetre(){
        return 2 * Math.PI * RAYON;
    }
    public double aire(){
        return Math.PI * Math.pow(RAYON, 2);
    }
}
