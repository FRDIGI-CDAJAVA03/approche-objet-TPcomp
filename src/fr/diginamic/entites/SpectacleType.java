package fr.diginamic.entites;
/** Type de spectacle */
public enum SpectacleType {
    /** Type du concert */
    CONCERT(0),
    /** Type de la comédie */
    COMEDIE(1),
    /** Type de l’improvisation */
    IMPROVISATION(2),
    /** Type de la danse */
    DANSE(3);
    /** Numéro de type de spectacle */
    private final int TYPE;

    /**
     * Construction du type de spectacle par son numéro.
     * @param type Numéro de type de spectacle
     */
    SpectacleType(int type) {
        this.TYPE = type;
    }

    /**
     * Obtention de valeur numérique du type de spectacle.
     * @return Numéro de type de spectacle
     */
    int value(){
        return this.TYPE;
    }
}
