package fr.diginamic.maison;
/** Types de pièce */
public enum PieceType {
    /** Type de la pièce */
    PIECE(0),
    /** Type de la chambre */
    CHAMBRE(1),
    /** Type du salon */
    SALON(2),
    /** Type de la cuisine */
    CUISINE(3),
    /** Type de la salle de bain */
    SALLE_DE_BAIN(4),
    /** Type du cabinet d’eau */
    WC(5);
    /** Numéro de type de pièce */
    private final int TYPE;

    /**
     * Construction du type de pièce.
     * @param type Numéro de type
     */
    PieceType(int type){
        this.TYPE = type;
    }

    /**
     * Obtention du numéro de type de pièce.
     * @return Numéro du type de pièce
     */
    public int value() {
        return this.TYPE;
    }
}
