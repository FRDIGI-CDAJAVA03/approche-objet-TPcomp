package fr.diginamic.formes;
/** Forme du carré. */
public class Carre extends Rectangle{
    /** Longueur */
    private final double LONGUEUR;
    /**
     * Construction du carré.
     *
     * @param longueur Longueur
     */
    public Carre(double longueur) {
        super(longueur, longueur);
        this.LONGUEUR = longueur;
    }
}
