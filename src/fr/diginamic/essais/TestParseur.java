package fr.diginamic.essais;

//Opérande gauche constant: /^[0-9]+(\.[0-9]+)?/
//System.out.print(Pattern.matches("^\\d+(\\.\\d+)?", "54688646.4"));
//Opérande gauche variable: /^[a-zA-Z][0-9a-zA-Z]*/
//System.out.print(Pattern.matches("^\\p{Alpha}+[0-9a-zA-Z]*", "g44"));
//Opérateur: /[+\x2a\/-]./
//System.out.print(Pattern.matches("[+*/-]", "*"));
//Opérande droit constant: /[0-9].[0-9\.]*$/
//System.out.print(Pattern.matches("\\d+(\\.\\d+)?$", "54688646.4"));
//Opérande droit variable: /[a-zA-Z].[0-9a-zA-Z]*$/
//System.out.print(Pattern.matches("\\p{Alpha}+[0-9a-zA-Z]*$", "g44"));

import fr.diginamic.parseur.BadEquationException;
import fr.diginamic.parseur.Expression;
import fr.diginamic.parseur.Parser;

public class TestParseur {
    public static void main(String[] args){
        try{
            final Expression EXPRESSION = Parser.parse("b4*3.2");
        } catch (BadEquationException ex) {
            ex.printStackTrace();
        }
    }
}
