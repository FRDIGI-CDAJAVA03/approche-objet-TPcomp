package fr.diginamic.entites;

import java.util.HashMap;

/** Théâtre professionnel */
public class TheatrePro {
    /** Nom du théâtre */
    private final String NOM;
    /** Tableau des spectacles de ce théâtre */
    private final HashMap<String, Spectacle> SPECTACLES = new HashMap<>();
    /**
     * Construction d’un théâtre.
     * @param nom Nom du théâtre
     */
    public TheatrePro(String nom) {
        this.NOM = nom;
    }

    /**
     * Ajouter un spectacle de titre nouveau au tableau des spectacles du théâtre.
     * @param nom Titre du spectacle
     * @param type Numéro de type de spectacle
     * @param tarif Tarif du spectacle
     * @param capacite Capacité d’accueil
     * @throws KeyAlreadyExistsException Exception due à un titre déjà présent
     * dans le tableau des spectacles
     * @throws OutOfLimitNumberException Exception due à un numéro de type
     * hors limite.
     */
    public void ajouterSpectacle(String nom, int type, double tarif, int capacite) throws KeyAlreadyExistsException,
            OutOfLimitNumberException{
        if(SPECTACLES.containsKey(nom)){
            throw new KeyAlreadyExistsException("Ce spectacle existe déjà!");
        }
        this.SPECTACLES.put(nom, new Spectacle(nom, type, tarif, capacite));
    }

    /**
     * Ajouter un spectacle de titre nouveau au tableau des spectacles du théâtre.
     * @param nom Titre du spectacle
     * @param type Type de spectacle
     * @param tarif Tarif du spectacle
     * @param capacite Capacité d’accueil
     * @throws KeyAlreadyExistsException Exception due à l’impossibilité d’ajouter
     * un spectacle dont le nom existe déjà dans le tableau des spectacles
     */
    public void ajouterSpectacle(String nom, SpectacleType type, double tarif, int capacite)
            throws KeyAlreadyExistsException{
        if(SPECTACLES.containsKey(nom)){
            throw new KeyAlreadyExistsException("Ce spectacle existe déjà!");
        }
        this.SPECTACLES.put(nom, new Spectacle(nom, type, tarif, capacite));
    }

    /**
     * Obtenir par son nom le spectacle du théâtre.
     * @param nom Nom du spectacle
     * @return Spectacle du théâtre
     * @throws KeyDoesNotExistException Exception due à un spectacle absent du tableau
     * des spectacles du théâtre
     */
    public Spectacle getSpectacle(String nom) throws KeyDoesNotExistException{
        if(! SPECTACLES.containsKey(nom)){
            throw new KeyDoesNotExistException("Ce spectacle n’existe pas!");
        }
        return this.SPECTACLES.get(nom);
    }

    /**
     * Inscrire des clients au spectacle du théâtre
     * @param clients Clients à inscrire
     * @param nom Nom du spectacle
     * @throws KeyDoesNotExistException Exception due à un spectacle absent du tableau
     * des spectacles du théâtre
     * @throws OutOfLimitNumberException Exception due aux spectateurs inscrits dont
     * le total est négatif ou dépasse la capacité maximale d’accueil
     */
    public void inscrire(int clients, String nom) throws KeyDoesNotExistException, OutOfLimitNumberException{
        if(! SPECTACLES.containsKey(nom)){
            throw new KeyDoesNotExistException("Ce spectacle n’existe pas!");
        }
        final Spectacle SPECTACLE = this.SPECTACLES.get(nom);
        SPECTACLE.setInscrits(clients);
    }

    /**
     * Obtenir la recette totale des spectacles dans le tableau des spectacles
     * du théâtre.
     * @return Recette totale
     */
    public double getRecetteTotale(){
        double recetteTotale = 0;
        for(Spectacle spectacle: this.SPECTACLES.values()){
            recetteTotale += spectacle.getTarif() * spectacle.getInscrits();
        }
        return recetteTotale;
    }
    /**
     * Obtenir la recette totale des spectacles dans le tableau des spectacles
     * du théâtre.
     * @return Recette totale
     */
    public int getClientsTotal(){
        int clientsTotal = 0;
        for(Spectacle spectacle: this.SPECTACLES.values()){
            clientsTotal += spectacle.getInscrits();
        }
        return clientsTotal;
    }

    /**
     * Obtenir le nom de la troupe de théâtre.
     * @return Nom de la troupe de théâtre
     */
    public String getNom() {
        return this.NOM;
    }
}
