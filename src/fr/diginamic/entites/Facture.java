package fr.diginamic.entites;

public class Facture {
    private double nbKwh;
    private double montantTTC;
    private double montantHT;
    public Facture(double nbKwh){
        this.nbKwh = nbKwh;
        this.montantTTC = 0.15 * nbKwh;
        this.montantHT = 8.0 / 10.0 * nbKwh;
    }
    public void addKwh(double nbKwh){
        this.nbKwh += nbKwh;
        this.montantTTC = 0.15 * this.nbKwh;
        this.montantHT =  8.0 / 10.0 * this.nbKwh;
    }
    public String toString(){
        return String.format("{\n  Energie: %.2f kW⋅h,\n  MontantTTC: %.2f €,\n  MontantHT: %.2f €,\n}\n",
                this.nbKwh,
                this.montantTTC,
                this.montantHT);
    }
}
