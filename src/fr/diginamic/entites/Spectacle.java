package fr.diginamic.entites;

/** Spectacle de théâtre */
public class Spectacle {
    /** Nom du spectacle */
    private final String NOM;
    /** Numéro du type de spectacle */
    private final int TYPE;
    /** Tarif unitaire */
    private final double TARIF;
    /** Capacité maximale d’accueil du spectacle */
    private final int CAPACITE;
    /** Nombre de spectateurs inscrits */
    private int inscrits;

    /**
     * Construction du spectacle.
     * @param nom Nom du spectacle
     * @param type Numéro du type de spectacle
     * @param tarif Tarif unitaire
     * @param capacite Capacité maximale d’accueil
     */
    public Spectacle(String nom, int type, double tarif, int capacite) throws OutOfLimitNumberException{
        if(type < 0 || type > 3){
            throw new OutOfLimitNumberException("Limite dépassée par ce nombre!");
        }
        this.NOM = nom;
        this.TYPE = type;
        this.TARIF = tarif;
        this.CAPACITE = capacite;
    }
    public Spectacle(String nom, SpectacleType type, double tarif, int capacite) {
        this.NOM = nom;
        this.TYPE = type.value();
        this.TARIF = tarif;
        this.CAPACITE = capacite;
    }

    /**
     * Accéder au tarif du spectacle.
     * @return Tarif unitaire
     */
    double getTarif() {
        return TARIF;
    }

    /**
     * Accéder au nombre de spectateurs inscrits.
     * @return Nombre de spectateurs inscrits
     */
    int getInscrits() {
        return inscrits;
    }

    /**
     * Cumuler le nombre de spectateurs inscrits au spectacle.
     * @param inscrits Nombre de spectateurs à inscrire
     * @throws OutOfLimitNumberException Exception due aux spectateurs inscrits dont
     * le total est négatif ou dépasse la capacité maximale d’accueil
     */

    void setInscrits(int inscrits) throws OutOfLimitNumberException{
        final int APRES = this.inscrits + inscrits;
        if(APRES < 0 || APRES > this.CAPACITE){
            throw new OutOfLimitNumberException("Limite dépassée par ce nombre!");
        }
        this.inscrits += inscrits;
    }
}
