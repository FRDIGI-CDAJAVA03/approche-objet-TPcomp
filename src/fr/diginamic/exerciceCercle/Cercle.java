package fr.diginamic.exerciceCercle;

public class Cercle {
    private double rayon;
    public Cercle(double rayon) {
        this.rayon = rayon;
    }
    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double setPerimetre(double rayon)
    {
        return 2*Math.PI*rayon;
    }

    public double setSurface(double rayon)
    {
        return Math.PI*rayon*rayon;
    }

}
