package fr.diginamic.salaire;

public abstract class Intervenant {
    private String nom;
    private String prenom;
    private String status;

    public Intervenant(String nom, String prenom, String status) {
        this.nom = nom;
        this.prenom = prenom;
        this.status = status;
    }

    public abstract double getSalaire();

    public void afficherDonnees(){
        System.out.println(nom + ' ' + prenom + ' ' + status + ' ' + getSalaire());
    }

}
