package fr.diginamic.salaire;

/**
 * Intervenant travaillant pour la société de presse
 * « La Voix de Saint-Herblain »
 */
public abstract class Intervenant {
    /** Nom */
    protected final String NOM;
    /** Prénom */
    protected final String PRENOM;

    /**
     * Construction de l’intervenant.
     * @param nom Nom
     * @param prenom Prénom
     */
    public Intervenant(String nom, String prenom) {
        this.NOM = nom;
        this.PRENOM = prenom;
    }
    public static void afficherDonnees(Intervenant intervenant){
        final String[] SALAIRE_ET_STATUT = intervenant.getSalaireStatut();
        System.out.printf("{\n  nom: %s,\n  prenom: %s,\n  salaire: %s,\n  statut: %s\n}\n",
                intervenant.NOM,
                intervenant.PRENOM,
                SALAIRE_ET_STATUT[0],
                SALAIRE_ET_STATUT[1]);
    }
    /**
     * Accéder textuellement au salaire mensuel et
     * au statut de l’intervenant.
     * @return Salaire et statut
     */
    protected abstract String[] getSalaireStatut();
    /**
     * Accéder au salaire de l’intervenant.
     * @return Salaire
     */
    public abstract double getSalaire();
}
