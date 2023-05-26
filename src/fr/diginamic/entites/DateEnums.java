package fr.diginamic.entites;

public class DateEnums {
    public enum Mois{
       JANVIER("Janvier", 1),
       FEVRIER("Fevrier", 2),
       MARS("Mars", 3),
       AVRIL("Avril", 4),
       MAI("Mai", 5),
       JUIN("Juin", 6),
       JUILLER("Juillet", 7),
       AOUT("Aout", 8),
       SEPTEMBRE("Septembre", 9),
       OCTOBRE("Octobre", 10),
       NOVEMBRE("Novembre", 11),
       DECEMBRE("Decembre", 12),
       ;

       String libelle;
       int numero;

        Mois(String libelle, int numero ) {
            this.libelle = libelle;
            this.numero = numero;
        }

        public String getLibelle() {
            return libelle;
        }

        public void setLibelle(String libelle) {
            this.libelle = libelle;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        @Override
        public String toString() {
            return libelle + " " + numero;
        }
    }

    public enum Jours{
        LUNDI("Lundi", 1),
        MARDI("Mardi", 2),
        MERCREDI("Mercredi", 3),
        JEUDI("Jeudi", 4),
        VENDREDI("Vendredi", 5),
        SAMEDI("Samedi", 6),
        DIMANCHE("Dimanche", 7),
        ;
        String libelle;
        int numero;

        Jours(String libelle, int numero) {
            this.libelle = libelle;
            this.numero = numero;
        }

        public String getLibelle() {
            return libelle;
        }

        public void setLibelle(String libelle) {
            this.libelle = libelle;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        @Override
        public String toString() {
            return libelle + " " + numero;
        }
    }
}
