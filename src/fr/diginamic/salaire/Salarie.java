package fr.diginamic.salaire;

public class Salarie extends Intervenant {

    double montantSalaire;

    public Salarie(String nom, String prenom, double montantSalaire, String status) {
        super(nom, prenom, status);
        this.montantSalaire = montantSalaire;
    }

    @Override
    public double getSalaire() {
        return this.montantSalaire;
    }

    public double getMontantSalaire() {
        return montantSalaire;
    }

    public void setMontantSalaire(double montantSalaire) {
        this.montantSalaire = montantSalaire;
    }
}
