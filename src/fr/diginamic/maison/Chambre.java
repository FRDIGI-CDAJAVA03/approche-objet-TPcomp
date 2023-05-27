package fr.diginamic.maison;

/** Chambre d’une maison */
public class Chambre extends Piece{
    /**
     * Construction d’une chambre.
     * @param superficie Superficie
     * @param etage Numéro d’étage
     */
    public Chambre(double superficie, byte etage) {
        super(superficie, etage);
    }
    /**
     * Obtenir le numéro du type de pièce.
     * @return Numéro du type de pièce
     */
    @Override
    int getType() {
        return 1;
    }
}
