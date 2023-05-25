package fr.diginamic.entites;

public class Ampoule {
    private boolean etat;
    public Ampoule(){
        this.etat = false;
    }
    public void clic(){
        this.etat = ! this.etat;
    }
    public String toString(){
        return etat ? "Allumée" : "Éteinte";
    }
}
