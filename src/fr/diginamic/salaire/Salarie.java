package fr.diginamic.salaire;

/**
 * Salarié travaillant pour la société de presse
 * « La Voix de Saint-Herblain » et sous contrat
 * à durée déterminée ou indéterminée.
 */
public class Salarie extends Intervenant{
    /** Salaire hebdomadaire */
    private final double SALAIRE;
    /**
     * Construction du salarié.
     * @param nom Nom
     * @param prenom Prénom
     * @param salaire Salaire
     */
    public Salarie(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.SALAIRE = salaire;
    }
    /**
     * Accéder au salaire du salarié.
     * @return Salaire
     */
    @Override
    public double getSalaire() {
        return this.SALAIRE;
    }
}
