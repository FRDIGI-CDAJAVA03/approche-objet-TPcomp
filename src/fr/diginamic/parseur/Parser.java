package fr.diginamic.parseur;
/** Parser */
public class Parser {
    public static Expression parse(String equation) throws BadEquationException {
        final boolean IS_CONST_VAR = equation.matches("^\\p{Alpha}+[0-9a-zA-Z]*[+*/-]\\d+(\\.\\d+)?$");
        final boolean IS_VAR_CONST = equation.matches("^\\d+(\\.\\d+)?[+*/-]\\p{Alpha}+[0-9a-zA-Z]*");
        final boolean IS_CONST_CONST = equation.matches("^\\d+(\\.\\d+)?[+*/-]\\d+(\\.\\d+)?$");
        if(!((IS_CONST_VAR && !IS_VAR_CONST && !IS_CONST_CONST) ||
                (!IS_CONST_VAR && IS_VAR_CONST && !IS_CONST_CONST) ||
                (!IS_CONST_VAR && !IS_VAR_CONST && IS_CONST_CONST))){
            throw new BadEquationException("Bad equation syntax!");
        }
        final String[] OPERANDS = equation.split("[+*/-]");
        final char operator = equation.charAt(OPERANDS[0].length());
        if(IS_CONST_VAR){
            return new Expression(OPERANDS[0], operator, OPERANDS[1], ExpressionType.CONST_VAR);
        }
        if(IS_VAR_CONST){
            return new Expression(OPERANDS[0], operator, OPERANDS[1], ExpressionType.VAR_CONST);
        }
        if(IS_CONST_CONST){
            return new Expression(OPERANDS[0], operator, OPERANDS[1], ExpressionType.CONST_CONST);
        }
        throw new BadEquationException("Bad equation syntax!");
    }
}
