package fr.diginamic.entites;

public class Facture {
    private int nbKwh;
    private double montantTTC;
    private double montantHT;

    public Facture(int nbKwh) {
        this.nbKwh = nbKwh;
        this.montantTTC = this.nbKwh * 0.15;
        this.montantHT = this.montantTTC * 0.80;
    }

    public void addKwh(int nb){
        this.nbKwh = this.nbKwh + nb;
        this.montantTTC = this.nbKwh * 0.15;
        this.montantHT = this.montantTTC * 0.80;
    }

    @Override
    public String toString() {
        return "Facture : Consommation = " + nbKwh +
                " kWh, montant TTC = " + montantTTC +
                " €, montant HT = " + montantHT +
                " €.";
    }
}
