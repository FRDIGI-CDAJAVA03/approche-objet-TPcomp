package fr.diginamic.jdr;
/** Personnage */
class Personnage extends Competiteur {
    /** Score */
    private int score = 0;

    /**
     * Construction du personnage.
     */
    Personnage(){
        super(12, 18, 20, 50);
    }

    /**
     * Afficher les statistiques.
     */
    @Override
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
}
