package fr.diginamic.entites;

public class Cercle {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double perimetre(){
        Double perimetre = 2 * Math.PI * this.rayon;
        return perimetre;
    }

    public double surface (){
        Double surface = Math.PI * Math.pow(this.rayon, 2);
        return surface;
    }

}
