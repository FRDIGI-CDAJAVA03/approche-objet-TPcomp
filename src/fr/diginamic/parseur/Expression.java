package fr.diginamic.parseur;
/** Expression arithmétique */
public class Expression {
    /** Opérande de gauche */
    private final String OPERAND_LEFT;
    /** Caractère de l’opérateur binaire */
    private final char OPERATOR;
    /** Opérande de droite */
    private final String OPERAND_RIGHT;
    /** Variabilité à gauche */
    private final boolean IS_LEFT_VAR;
    /** Variabilité à droite */
    private final boolean IS_RIGHT_VAR;

    /**
     * Construction de l’expression arithmétique évaluable.
     * @param operandLeft Opérande de gauche
     * @param operator Opérateur binaire
     * @param operandRight Opérande de droite
     * @param type Type d’expression
     * @throws BadEquationException Exception due à une mauvaise écriture
     * de l’équation
     */
    Expression(String operandLeft,
            char operator,
            String operandRight,
            ExpressionType type) throws BadEquationException{
        this.OPERAND_LEFT = operandLeft;
        this.OPERATOR = operator;
        this.OPERAND_RIGHT = operandRight;
        switch (type.value()) {
            case 0 -> {
                this.IS_LEFT_VAR = false;
                this.IS_RIGHT_VAR = false;
            }
            case 1 -> {
                this.IS_LEFT_VAR = false;
                this.IS_RIGHT_VAR = true;
            }
            case 2 -> {
                this.IS_LEFT_VAR = true;
                this.IS_RIGHT_VAR = false;
            }
            default -> throw new BadEquationException("Bad equation syntax!");
        }
    }

    /**
     * Évaluer l’expression selon une variable explicite.
     * La variable déclarée doit correspondre à celle de l’expression.
     * @param key Nom clé de la variable.
     * @param value Valeur de la variable.
     * @return Valeur obtenue par le calcul de l’expression.
     * @throws BadEquationException Exception due à un mauvais nom de
     * la variable
     */
    public double evaluer(String key, double value) throws BadEquationException{
        if(!IS_LEFT_VAR && !IS_RIGHT_VAR){
            final double CONST_LEFT = Double.parseDouble(OPERAND_LEFT);
            final double CONST_RIGHT = Double.parseDouble(OPERAND_RIGHT);
            return operate(CONST_LEFT, OPERATOR, CONST_RIGHT);
        } else if(!IS_LEFT_VAR) {
            final double CONST_LEFT = Double.parseDouble(OPERAND_RIGHT);
            if(! key.equals(OPERAND_LEFT)){
                throw new BadEquationException("Bad equation syntax (variable doesn't match)!");
            }
            return operate(CONST_LEFT, OPERATOR, value);
        } else if(!IS_RIGHT_VAR) {
            final double CONST_RIGHT = Double.parseDouble(OPERAND_RIGHT);
            if(! key.equals(OPERAND_LEFT)){
                throw new BadEquationException("Bad equation syntax (variable doesn't match)!");
            }
            return operate(value, OPERATOR, CONST_RIGHT);
        } else {
            throw new BadEquationException("Bad equation syntax (bad operator)!");
        }
    }

    /**
     * Calculer selon l’opérateur binaire choisi.
     * @param operandLeft Opérande de gauche
     * @param operator Caractère de l’opérateur
     * @param operandRight Opérande de droite
     * @return Résultat du calcul
     * @throws BadEquationException Exception due à un mauvais opérateur
     * binaire.
     */
    private double operate(double operandLeft,
            char operator,
            double operandRight) throws BadEquationException{
        switch (operator){
            case '+' -> {
                return operandLeft + operandRight;
            }
            case '-' -> {
                return operandLeft - operandRight;
            }
            case '*' -> {
                return operandLeft * operandRight;
            }
            case '/' -> {
                return operandLeft / operandRight;
            }
            default -> throw new BadEquationException("Bad equation syntax (bad operator)!");
        }
    }
}
