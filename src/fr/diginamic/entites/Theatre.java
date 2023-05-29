package fr.diginamic.entites;

public class Theatre {
    private final String NOM;
    /*Max clients*/
    private final int CAPACITE;
    /*Clients inscrits*/
    private int clients;
    private int recette;

    public Theatre(String nom, int capacite) {
        this.NOM = nom;
        this.CAPACITE = capacite;
    }

    public void inscrire(int clients, int prixParPlace){
        if(this.clients + clients > this.CAPACITE){
            System.err.println("Out of capacity!");
            throw new Error("Out of capacity!");
        } else {
            this.clients += clients;
            this.recette += clients * prixParPlace;
        }
    }

    public int getClients() {
        return this.clients;
    }

    public int getRecette() {
        return this.recette;
    }
}
