package fr.diginamic.exerciceFacture;

public class Facture {
    private int nbKwh;
    private double montantTTC;
    private double montantHT;

    private final double PRIX_UNITAIRE_KWH = 0.15;
    private final double TAUX_NO_TVA = 0.8;
    public Facture(int nbKwh) {
        this.nbKwh = nbKwh;
        this.montantTTC = (double)nbKwh*PRIX_UNITAIRE_KWH;
        this.montantHT = this.montantTTC*TAUX_NO_TVA;
    }


    public void addKwh(int nb)
    {
        this.nbKwh += nb;
        this.montantTTC = (double) nbKwh*0.15;
        this.montantHT = this.montantTTC*0.8;
    }


    @Override
    public String toString() {
        return "Facture{" +
                "nbKwh=" + nbKwh +
                ", montantTTC=" + montantTTC +" Euros"+
                ", montantHT=" + montantHT +" Euros"+
                ", PRIX_UNITAIRE_KWH=" + PRIX_UNITAIRE_KWH +" Euros"+
                ", TAUX_NO_TVA=" + TAUX_NO_TVA +
                '}';
    }

    public double getNbKwh() {
        return nbKwh;
    }

    public void setNbKwh(int nbKwh) {
        this.nbKwh = nbKwh;
    }

    public double getMontantTTC() {
        return montantTTC;
    }

    public void setMontantTTC(double montantTTC) {
        this.montantTTC = montantTTC;
    }

    public double getMontantHT() {
        return montantHT;
    }

    public void setMontantHT(double montantHT) {
        this.montantHT = montantHT;
    }
}
