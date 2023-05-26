package fr.diginamic.entites;

import java.text.SimpleDateFormat;

public class Date {
    private final int jour;
    private final int mois;
    private final int annee;

    private static final java.util.Date now = new java.util.Date();

    public Date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public String format(int type) {
        String libelleMois = "";
        switch (type) {
            case 1 -> {
                DateEnums.Mois[] values = DateEnums.Mois.values();
                for (DateEnums.Mois mois : values) {
                    if (mois.getNumero() == this.mois) {
                        libelleMois = mois.getLibelle();
                    }
                }
                return "%d %s %d".formatted(this.jour, libelleMois, this.annee);
            }
            case 2 -> {
                return "%d/%d/%d".formatted(this.jour, this.mois, this.annee);
            }
            case 3 -> {
                return "%d/%d/%d".formatted(this.annee, this.mois, this.jour);
            }
            default -> {
                return "%d-%d-%d".formatted(this.annee, this.mois, this.jour);
            }
        }
    }

    public boolean estAvant() {
        java.util.Date date1 = new java.util.Date(this.jour, this.mois, this.annee);
        if (date1.getTime() < now.getTime()) {
            return true;
        }
        return false;
    }

    public boolean estApres() {
        java.util.Date date2 = new java.util.Date(this.jour, this.mois, this.annee);
        if (date2.getTime() > now.getTime()) {
            return true;
        }
        return false;
    }

    public boolean estEgale() {
        java.util.Date date3 = new java.util.Date(this.jour, this.mois, this.annee);
        if (date3.equals(now)) {
            return true;
        }
        return false;
    }
}
