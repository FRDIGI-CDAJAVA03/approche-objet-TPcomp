package fr.diginamic.maison;

/** Cabinet d’eau d’une maison */
public class WC extends Piece{
    /**
     * Construction d’un cabinet d’eau.
     * @param superficie Superficie
     * @param etage Numéro d’étage
     */
    public WC(double superficie, byte etage) {
        super(superficie, etage);
    }
    /**
     * Obtenir le numéro du type de pièce.
     * @return Numéro du type de pièce
     */
    @Override
    int getType() {
        return 5;
    }
}