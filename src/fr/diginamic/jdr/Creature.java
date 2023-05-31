package fr.diginamic.jdr;
/** Créature adverse */
abstract class Creature {
    /** Points de force */
    private final int FORCE;
    /** Points de santé maximale */
    private final int HEALTH_MAX;
    /** Points de santé */
    private int health;
    /** Type de créature */
    private final String type;
    /** Score fourni en cas de défaite */
    private final int DROPABLE_SCORE;

    /**
     * Construction de créature.
     * @param forceMin Points minimaux de force potentielle
     * @param forceMax Points maximaux de force potentielle
     * @param healthMaxMin Points minimaux de santé maximale potentielle
     * @param healthMaxMax Points maximaux de santé maximale potentielle
     */
    Creature(int forceMin,
             int forceMax,
             int healthMaxMin,
             int healthMaxMax,
             int dropableScore,
             String type){
        this.FORCE = (int)(Math.random() * (forceMax - forceMin)) + forceMin;
        final int HEALTH = (int)(Math.random() * (healthMaxMax - healthMaxMin)) +
                healthMaxMin;
        this.HEALTH_MAX = HEALTH;
        this.health = HEALTH;
        this.DROPABLE_SCORE = dropableScore;
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

    /**
     * Obtenir le type de créature.
     * @return Type de créature
     */
    String getType(){
        return this.type;
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
     * Laisser au vainqueur ce score supplémentaire.
     * @return Score supplémentaire.
     */
    int dropScore(){
        return this.DROPABLE_SCORE;
    }
}
