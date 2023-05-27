package fr.diginamic.maison;

public abstract class Piece {
    private double SUPERFICIE;
    private byte ETAGE;
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
    double getSuperficie() {
        return this.SUPERFICIE;
    }
    byte getEtage() {
        return this.ETAGE;
    }
}
