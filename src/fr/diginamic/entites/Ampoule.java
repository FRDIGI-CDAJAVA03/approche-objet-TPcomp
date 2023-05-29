package fr.diginamic.entites;

public class Ampoule {
    private boolean etat;

    public Ampoule() {
        this.etat = false;
    }

    public void clic(){
        etat = !etat;
    }

    @Override
    public String toString() {
        if (etat){
            return "Allumée";
        } else {
            return "Eteinte";
        }
    }
}
