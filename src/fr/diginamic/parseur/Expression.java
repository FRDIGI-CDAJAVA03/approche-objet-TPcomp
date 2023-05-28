package fr.diginamic.parseur;

public class Expression {
    private final String OPERAND_LEFT;
    private final char OPERATOR;
    private final String OPERAND_RIGHT;
    private final boolean IS_LEFT_VAR;
    private final boolean IS_RIGHT_VAR;
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
            default -> throw new BadEquationException("Bad equation syntax!");
        }
    }
}
