package fr.diginamic.maison;

/** Pièce d’une maison */
public abstract class Piece {
    /** Superficie de la pièce */
    private double SUPERFICIE;
    /** Numéro d’étage de la pièce */
    private byte ETAGE;
    /**
     * Construction d’une pièce.
     * @param superficie Superficie
     * @param etage Numéro d’étage
     */
    public Piece(double superficie, byte etage) {
        try{
            if(superficie < 0){
                throw new Exception(String.format("\u001b[33mAVERTISSEMENT : " +
                        "Mauvaise valeur de superficie (%f)\u001b[0m",
                        superficie));
            }
            this.SUPERFICIE = superficie;
            this.ETAGE = etage;
        } catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }
    /**
     * Obtenir l’aire de superficie de la pièce.
     * @return Aire de superficie
     */
    double getSuperficie() {
        return this.SUPERFICIE;
    }
    /**
     * Obtenir le numéro d’étage.
     * @return Numéro d’étage
     */
    byte getEtage() {
        return this.ETAGE;
    }
    /**
     * Obtenir le numéro du type de pièce.
     * @return Numéro du type de pièce
     */
    int getType() {
        return 0;
    }
}
