package fr.diginamic.parseur;
/** Exception due à une mauvaise équation */
public class BadEquationException extends Exception{
    /**
     * Construction de l’exception par un message.
     * @param message Message de l’exception
     */
    public BadEquationException(String message) {
        super(message);
    }
}
