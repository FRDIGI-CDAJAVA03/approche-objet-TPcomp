package fr.diginamic.entites;
/** Exception due à un nombre hors limite */
public class OutOfLimitNumberException extends Exception{
    /**
     * Construction d’exception due à un nombre hors limite
     * par un message d’erreur.
     * @param message Message d’erreur
     */
    public OutOfLimitNumberException(String message) {
        super("\u001b[33mAVERTISSEMENT" + message + "\u001b[0m");
    }
}
