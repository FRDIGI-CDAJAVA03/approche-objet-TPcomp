package fr.diginamic.maison;

/** Salle de bain d’une maison */
public class SalleDeBain extends Piece{
    /**
     * Construction d’une salle de bain.
     * @param superficie Superficie
     * @param etage Numéro d’étage
     */
    public SalleDeBain(double superficie, byte etage) {
        super(superficie, etage);
    }
    /**
     * Obtenir le numéro du type de pièce.
     * @return Numéro du type de pièce
     */
    @Override
    int getType() {
        return 4;
    }
}