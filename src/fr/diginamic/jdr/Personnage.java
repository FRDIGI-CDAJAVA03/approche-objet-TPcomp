package fr.diginamic.jdr;
/** Personnage */
class Personnage {
    /** Points de force */
    private final int FORCE;
    /** Points de santé maximale */
    private final int HEALTH_MAX;
    /** Points de santé */
    private int health;
    /** Score */
    private int score = 0;

    /**
     * Construction du personnage.
     */
    Personnage(){
        final int FORCE_MIN = 12;
        final int FORCE_MAX = 18;
        final int HEALTH_MAX_MIN = 20;
        final int HEALTH_MAX_MAX = 50;
        this.FORCE = (int)(Math.random() * (FORCE_MAX - FORCE_MIN)) + FORCE_MIN;
        final int HEALTH = (int)(Math.random() * (HEALTH_MAX_MAX - HEALTH_MAX_MIN)) +
                HEALTH_MAX_MIN;
        this.HEALTH_MAX = HEALTH;
        this.health = HEALTH;
    }

    /**
     * Afficher les statistiques.
     */
    void showStats(){
        System.out.printf("""
                
                Personnage
                Force: %02d
                Santé: %02d/%02d
                
                """,
                this.FORCE,
                this.health,
                this.HEALTH_MAX);
    }

    /**
     * Afficher le score.
     */
    void showScore(){
        System.out.printf("""
                
                Personnage
                Force: %02d
                Santé: %02d/%02d
                Score: %2d
                
                """,
                this.FORCE,
                this.health,
                this.HEALTH_MAX,
                this.score);
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
     * Augmenter le score.
     * @param gain Gain de score
     */
    void growScore(int gain){
        this.score += gain;
    }

    /**
     * Obtenir le score.
     * @return Score
     */
    int getScore() {
        return this.score;
    }

    /**
     * Obtenir les points de santé.
     * @return Points de santé
     */
    int getHealth() {
        return health;
    }

    /**
     * Obtenir les points de santé maximale.
     * @return Points de santé maximale
     */
    int getHealthMax() {
        return this.HEALTH_MAX;
    }

    /**
     * Obtenir les points de force.
     * @return Points de force
     */
    int getForce() {
        return this.FORCE;
    }
}
