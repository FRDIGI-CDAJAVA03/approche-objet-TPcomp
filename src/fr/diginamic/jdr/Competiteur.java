package fr.diginamic.jdr;
/** Compétiteur */
abstract class Competiteur {
    /** Points de force */
    protected final int FORCE;
    /** Points de santé maximale */
    protected final int HEALTH_MAX;
    /** Points de santé */
    protected int health;

    /**
     * Construction du compétiteur.
     * @param forceMin Points de force minimale
     * @param forceMax Points de force maximale
     * @param healthMaxMin Points minimaux de santé maximale
     * @param healthMaxMax Points maximaux de santé maximale
     */
    Competiteur(int forceMin,
                int forceMax,
                int healthMaxMin,
                int healthMaxMax){
        this.FORCE = (int)(Math.random() * (forceMax - forceMin)) + forceMin;
        final int HEALTH = (int)(Math.random() * (healthMaxMax - healthMaxMin)) +
                healthMaxMin;
        this.HEALTH_MAX = HEALTH;
        this.health = HEALTH;
    }
    /**
     * Perdre des points de santé.
     * @param damage Points de santé perdus
     */
    void looseHealth(int damage){
        if(damage > this.health){
            this.health = 0;
        } else {
            this.health -= damage;
        }
    }

    /**
     * Afficher les statistiques.
     */
    abstract void showStats();

    /**
     * Obtenir les points de force.
     * @return Points de force
     */
    int getForce() {
        return this.FORCE;
    }


    /**
     * Obtenir les points de santé.
     * @return points de santé
     */
    int getHealth() {
        return this.health;
    }

    /**
     * Obtenir les points de santé maximale.
     * @return Points de santé maximale
     */
    int getHealthMax() {
        return this.HEALTH_MAX;
    }
}
