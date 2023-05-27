package fr.diginamic.entites;
/** Exception due à une clef absente dans un dictionnaire */
public class KeyDoesNotExistException extends Exception{
    /**
     * Construction d’exception due à une clef absente
     * par un message d’erreur.
     * @param message Message d’erreur
     */
    public KeyDoesNotExistException(String message) {
        super("\u001b[33mAVERTISSEMENT" + message + "\u001b[0m");
    }
}
