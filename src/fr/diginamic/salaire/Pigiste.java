package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
    int nbJoursTravailles;

    double montantJournalier;

    public Pigiste(String nom, String prenom, String status) {
        super(nom, prenom, status);
    }

    @Override
    public double getSalaire() {
        return this.nbJoursTravailles * this.montantJournalier;
    }

    public int getNbJoursTravailles() {
        return nbJoursTravailles;
    }

    public void setNbJoursTravailles(int nbJoursTravailles) {
        this.nbJoursTravailles = nbJoursTravailles;
    }

    public double getMontantJournalier() {
        return montantJournalier;
    }

    public void setMontantJournalier(double montantJournalier) {
        this.montantJournalier = montantJournalier;
    }
}
