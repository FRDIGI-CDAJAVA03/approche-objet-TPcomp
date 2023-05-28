package fr.diginamic.parseur;
/** Type d’expression arithmétique */
public enum ExpressionType {
    /** Expression sans opérande variable */
    CONST_CONST(0),
    /** Expression avec opérande variable à droite */
    CONST_VAR(1),
    /** Expression avec opérande variable à gauche */
    VAR_CONST(2);
    /** Numéro du type d’expression */
    private final int TYPE;

    /**
     * Construction du type d’expression.
     * @param type Numéro du type d’expression
     */
    ExpressionType(int type){
        this.TYPE = type;
    }

    /**
     * Évaluer le type d’expression par son numéro.
     * @return Numéro du type d’expression
     */
    int value(){
        return this.TYPE;
    }
}
