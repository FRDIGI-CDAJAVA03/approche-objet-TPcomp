package fr.diginamic.jdr;
/** Créature adverse */
abstract class Creature extends Competiteur{
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
        super(forceMin, forceMax, healthMaxMin, healthMaxMax);
        this.DROPABLE_SCORE = dropableScore;
        this.type = type;
    }

    /**
     * Afficher les statistiques.
     */
    @Override
    void showStats(){
        System.out.printf("""
                
                %s
                Force: %02d
                Santé: %02d/%02d
                
                """,
                this.type,
                this.FORCE,
                this.health,
                this.HEALTH_MAX);
    }
    /**
     * Obtenir le type de créature.
     * @return Type de créature
     */
    String getType(){
        return this.type;
    }

    /**
     * Laisser au vainqueur ce score supplémentaire.
     * @return Score supplémentaire.
     */
    int dropScore(){
        return this.DROPABLE_SCORE;
    }
}
