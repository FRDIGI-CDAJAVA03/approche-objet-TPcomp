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

    /**
     * Accéder au salaire de l’intervenant.
     * @return Salaire
     */
    public abstract double getSalaire();
}
