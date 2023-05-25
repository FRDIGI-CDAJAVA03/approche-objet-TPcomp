package fr.diginamic.entites;

public class Date {
    private int jour;
    private int mois;
    private int annee;
    private static final int[] JOUR_SIZES_LIST = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final String[] MOIS_LIST = {"janvier",
            "février",
            "mars",
            "avril",
            "mai",
            "juin",
            "juillet",
            "août",
            "septembre",
            "octobre",
            "novembre",
            "décembre"};
    public Date(int jour, int mois, int annee){
        if(annee < 1 || annee > 9999){
            throw new IllegalStateException("Mauvaise année: " + annee);
        }
        if(mois < 1 || mois > 12){
            throw new IllegalStateException("Mauvais mois: " + mois);
        }
        if(jour < 1 || jour > Date.JOUR_SIZES_LIST[mois]){
            throw new IllegalStateException("Mauvais jour: " + jour);
        }
        this.annee = annee;
        this.mois = mois;
        this.jour = jour;
    }
    public String format(int type){
        switch (type){
            case 1:
                return String.format("%d %s %d",
                        this.jour,
                        Date.MOIS_LIST[this.mois - 1],
                        this.annee);
            case 2:
                return String.format("%2d/%2d/%4d",
                        this.jour,
                        this.mois,
                        this.annee);
            case 3:
                return String.format("%2d/%2d/%4d",
                        this.annee,
                        this.mois,
                        this.jour);
            default:
                throw new IllegalStateException("Mauvais type: " + type);
        }
    }
    public boolean estAvant(Date date){
        return date.getAnnee() < this.annee ||
                (date.getAnnee() == this.annee &&
                        date.getMois() < this.mois) ||
                (date.getAnnee() == this.annee &&
                        date.getMois() == this.mois &&
                        date.getJour() < this.jour);
    }
    public boolean estApres(Date date){
        return date.getAnnee() > this.annee ||
                (date.getAnnee() == this.annee &&
                        date.getMois() > this.mois) ||
                (date.getAnnee() == this.annee &&
                        date.getMois() == this.mois &&
                        date.getJour() > this.jour);
    }
    public boolean estEgal(Date date){
        return date.getAnnee() == this.annee &&
                date.getMois() == this.mois &&
                date.getJour() == this.jour;
    }
    public int getJour() {
        return jour;
    }

    public int getMois() {
        return mois;
    }

    public int getAnnee() {
        return annee;
    }
}
