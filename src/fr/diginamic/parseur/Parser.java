package fr.diginamic.parseur;
/** Parser */
public class Parser {
    /**
     * Interpréter le texte devant être une expression arithmétique
     * à deux opérateurs comme « 12.3E-7*-2.1E1 ».
     * Un des opérateurs peut être une variable dont le nom commence
     * par un caractère alphabétique (ASCII).
     * @param equation Texte de l’équation
     * @return Expression à évaluer.
     * @throws BadEquationException Exception due à une mauvaise écriture
     * de l’équation
     */
    public static Expression parse(String equation) throws BadEquationException {
        final String CVREGEX = "^-?\\d+(\\.\\d+)?([Ee]-?\\d+)?[+*/-]\\p{Alpha}+[0-9a-zA-Z]*$";
        final String VCREGEX = "^\\p{Alpha}+[0-9a-zA-Z]*[+*/-]-?\\d+(\\.\\d+)?([Ee]-?\\d+)?$";
        final String CCREGEX = "^-?\\d+(\\.\\d+)?([Ee]-?\\d+)?[+*/-]-?\\d+(\\.\\d+)?([Ee]-?\\d+)?$";
        final boolean IS_CONST_VAR = equation.matches(CVREGEX);
        final boolean IS_VAR_CONST = equation.matches(VCREGEX);
        final boolean IS_CONST_CONST = equation.matches(CCREGEX);
        if(!((IS_CONST_VAR && !IS_VAR_CONST && !IS_CONST_CONST) ||
                (!IS_CONST_VAR && IS_VAR_CONST && !IS_CONST_CONST) ||
                (!IS_CONST_VAR && !IS_VAR_CONST && IS_CONST_CONST))){
            throw new BadEquationException("Bad equation syntax!");
        }
        final String[] OPERANDS = equation.split("(?<=^-?\\d+(\\.\\d+)?([Ee]-?\\d+)?)" +
                "[+*/-]" +
                "(?=-?\\d+(\\.\\d+)?([Ee]-?\\d+)?$)");
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
