package fr.diginamic.formes;

/** Forme du cercle. */
public class Cercle extends Forme{
    /** Rayon */
    private final double RAYON;
    /**
     * Construction du cercle selon son rayon.
     * @param rayon Rayon
     */
    public Cercle(double rayon) {
        this.RAYON = rayon;
    }
    /**
     * Méthode pour l’aire de surface du cercle.
     * @return Aire de surface
     */
    @Override
    public double calculerSurface() {
        return Math.PI * Math.pow(RAYON, 2);
    }
    /**
     * Méthode pour le périmètre du cercle.
     * @return Périmètre
     */
    @Override
    public double calculerPerimetre() {
        return 2 * Math.PI * RAYON;
    }
}
