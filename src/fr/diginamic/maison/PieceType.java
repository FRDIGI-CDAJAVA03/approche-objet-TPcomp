package fr.diginamic.maison;

public enum PieceType {
    PIECE(0),
    CHAMBRE(1),
    SALON(2),
    CUISINE(3),
    SALLE_DE_BAIN(4),
    WC(5);
    private final int TYPE;
    PieceType(int type){
        this.TYPE = type;
    }
    public int value() {
        return this.TYPE;
    }
}
