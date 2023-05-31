package fr.diginamic.jdr;

class Personnage {
    private final int FORCE;
    private final int HEALTH_MAX;
    private int health;
    private int score = 0;
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
    void looseHealth(int damage){
        if(damage > this.health){
            this.health = 0;
        } else {
            this.health -= damage;
        }
    }
    void growScore(int gain){
        this.score += gain;
    }
    int getScore() {
        return this.score;
    }
    int getHealth() {
        return health;
    }
    int getForce() {
        return this.FORCE;
    }
}
