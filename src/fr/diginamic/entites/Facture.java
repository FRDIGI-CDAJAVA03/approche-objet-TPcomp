package fr.diginamic.entites;

import java.math.BigDecimal;

public class Facture {
    private double nbKwh;
    private BigDecimal montantTTC;

    private BigDecimal montantHT;

    public Facture(double nbKwh) {
        this.nbKwh = nbKwh;
        calcMontant(nbKwh);
    }

    public void addKwh(int nb){
        this.nbKwh += nb;
        calcMontant(this.nbKwh);
    }

    private void calcMontant(double nbKwh) {
        montantTTC = BigDecimal.valueOf(nbKwh * 0.15);
        montantHT = montantTTC.multiply(BigDecimal.valueOf(0.8));
    }

    public double getNbKwh() {
        return nbKwh;
    }

    public void setNbKwh(double nbKwh) {
        this.nbKwh = nbKwh;
    }

    public BigDecimal getMontantTTC() {
        return montantTTC;
    }

    public void setMontantTTC(BigDecimal montantTTC) {
        this.montantTTC = montantTTC;
    }

    public BigDecimal getMontantHT() {
        return montantHT;
    }

    public void setMontantHT(BigDecimal montantHT) {
        this.montantHT = montantHT;
    }

    @Override
    public String toString() {
        return "Facture: " +
                "nbKwh=" + nbKwh +
                ", montantTTC=" + montantTTC +
                ", montantHT=" + montantHT;
    }
}
