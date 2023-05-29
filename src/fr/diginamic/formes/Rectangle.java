package fr.diginamic.formes;

/** Forme du parallélogramme rectangle. */
public class Rectangle extends Forme{
    /** Longueur */
    private final double LONGUEUR;
    /** Largeur */
    private final double LARGEUR;

    /**
     * Construction du rectangle.
     * @param longueur Longueur
     * @param largeur Largeur
     */
    public Rectangle(double longueur, double largeur) {
        this.LONGUEUR = longueur;
        this.LARGEUR = largeur;
    }
    /**
     * Méthode pour l’aire de surface du rectangle.
     * @return Aire de surface
     */
    @Override
    public double calculerSurface() {
        return LONGUEUR * LARGEUR;
    }
    /**
     * Méthode pour le périmètre du rectangle.
     * @return Périmètre
     */
    @Override
    public double calculerPerimetre() {
        return 2 * (LONGUEUR + LARGEUR);
    }
}
