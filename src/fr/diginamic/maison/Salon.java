package fr.diginamic.maison;

/** Salon d’une maison */
public class Salon extends Piece{
    /**
     * Construction d’un salon.
     * @param superficie Superficie
     * @param etage Numéro d’étage
     */
    public Salon(double superficie, byte etage) {
        super(superficie, etage);
    }
    /**
     * Obtenir le numéro du type de pièce.
     * @return Numéro du type de pièce
     */
    @Override
    int getType() {
        return 2;
    }
}