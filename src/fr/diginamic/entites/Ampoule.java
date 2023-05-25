package fr.diginamic.entites;

public class Ampoule {
    private boolean etat;

    public Ampoule() {
        this.etat = false;
    }

    public void click(){
        etat = !etat;
    }

    public boolean isEtat() {
        return etat;
    }

    @Override
    public String toString() {
        if(isEtat()){
            return "Allumée";
        }
        return "Eteinte";
    }
}
