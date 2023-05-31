package fr.diginamic.jdr;
/** Créature adverse */
abstract class Creature {
    /** Points de force */
    protected final int FORCE;
    /** Points de santé maximale */
    protected final int HEALTH_MAX;
    /** Points de santé */
    protected int health;
    protected final String type;

    /**
     * Construction de créature.
     * @param forceMin Points minimaux de force potentielle
     * @param forceMax Points maximaux de force potentielle
     * @param healthMaxMin Points minimaux de santé maximale potentielle
     * @param healthMaxMax Points maximaux de santé maximale potentielle
     */
    Creature(int forceMin, int forceMax, int healthMaxMin, int healthMaxMax, String type){
        this.FORCE = (int)(Math.random() * (forceMax - forceMin)) + forceMin;
        final int HEALTH = (int)(Math.random() * (healthMaxMax - healthMaxMin)) +
                healthMaxMin;
        this.HEALTH_MAX = HEALTH;
        this.health = HEALTH;
        this.type = type;
    }

    /**
     * Afficher les statistiques.
     */
    void showStats(){
        System.out.printf("""
                
                %s
                Force: %d
                Santé: %d/%d
                
                """,
                this.type,
                this.FORCE,
                this.health,
                this.HEALTH_MAX);
    }

    /**
     * Obtenir les points de force.
     * @return Points de force
     */
    int getForce() {
        return this.FORCE;
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
}
