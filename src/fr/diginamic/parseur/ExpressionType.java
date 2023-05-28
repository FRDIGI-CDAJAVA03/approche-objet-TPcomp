package fr.diginamic.parseur;

public enum ExpressionType {
    CONST_CONST(0),
    CONST_VAR(1),
    VAR_CONST(2);
    private final int TYPE;
    ExpressionType(int type){
        this.TYPE = type;
    }
    int value(){
        return this.TYPE;
    }
}
