package fr.diginamic.entites;
/** Exception due à une clef déjà présente dans un dictionnaire */
public class KeyAlreadyExistsException extends Exception{
    /**
     * Construction d’exception due à une clef déjà présente
     * par un message d’erreur.
     * @param message Message d’erreur
     */
    public KeyAlreadyExistsException(String message) {
        super("\u001b[33mAVERTISSEMENT:" + message + "\u001b[0m");
    }
}
