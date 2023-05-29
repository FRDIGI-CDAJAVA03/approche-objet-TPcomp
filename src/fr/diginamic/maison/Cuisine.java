package fr.diginamic.maison;

/** Cuisine d’une maison */
public class Cuisine extends Piece{
    /**
     * Construction d’une cuisine.
     * @param superficie Superficie
     * @param etage Numéro d’étage
     */
    public Cuisine(double superficie, byte etage) {
        super(superficie, etage);
    }
    /**
     * Obtenir le numéro du type de pièce.
     * @return Numéro du type de pièce
     */
    @Override
    int getType() {
        return 3;
    }
}