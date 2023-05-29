package fr.diginamic.salaire;

/**
 * Pigiste travaillant pour la société de presse
 * « La Voix de Saint-Herblain » et rémunéré la journée.
 */
public class Pigiste extends Intervenant{
    /** Salaire quotidien */
    private final double SALAIRE;
    /** Jours rémunérés dans le mois */
    private final double JOURS;
    /**
     * Construction du pigiste.
     * @param nom Nom
     * @param prenom Prénom
     * @param salaire Salaire
     * @param jours Jour
     */
    public Pigiste(String nom, String prenom, double salaire, double jours) throws Exception {
        super(nom, prenom);
        if(jours > 31){
            throw new Exception("Number over monthly day limit (31)");
        }
        this.SALAIRE = salaire;
        this.JOURS = jours;
    }
    /**
     * Accéder textuellement au salaire mensuel et
     * au statut du pigiste.
     * @return Salaire et statut
     */
    @Override
    protected String[] getSalaireStatut() {
        return new String[]{String.format("%f", this.SALAIRE * this.JOURS), "pigiste"};
    }
    /**
     * Accéder au salaire du pigiste.
     * @return Salaire
     */
    @Override
    public double getSalaire() {
        return this.SALAIRE * this.JOURS;
    }
}
