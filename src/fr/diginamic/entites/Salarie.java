package fr.diginamic.entites;

public class Salarie {
    private final String NOM;
    private final String PRENOM;
    private final double SALAIRE;

    public Salarie(String nom, String prenom, double salaire) {
        this.NOM = nom;
        this.PRENOM = prenom;
        this.SALAIRE = salaire;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Salarie{");
        sb.append("NOM='").append(NOM).append('\'');
        sb.append(", PRENOM='").append(PRENOM).append('\'');
        sb.append(", SALAIRE=").append(String.format("%.2f", SALAIRE));
        sb.append('}');
        return sb.toString();
    }
}
