package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args){
        Maison maison = new Maison();
        maison.ajouterPiece(new Cuisine(12.0, (byte) 0));
        maison.ajouterPiece(new WC(7.0, (byte) 0));
        maison.ajouterPiece(new Salon(31.7, (byte) 0));
        maison.ajouterPiece(new Chambre(23.0, (byte) 1));
        maison.ajouterPiece(new Chambre(21.3, (byte) 1));
        maison.ajouterPiece(null);
        System.out.printf("Dans la maison nous avons une superficie totale de \u001b[32m%f\u001b[0m m²" +
                        " dont \u001b[32m%f\u001b[0m m² au premier étage.\n",
                maison.getSuperficieTotale(),
                maison.getSuperficieTotale((byte) 1));
        maison.ajouterPiece(new WC(-7.0, (byte) 0));
        System.out.printf("Dans la maison nous avons une superficie totale de \u001b[32m%f\u001b[0m m²" +
                " dont \u001b[32m%f\u001b[0m m² au premier étage.\n",
                maison.getSuperficieTotale(),
                maison.getSuperficieTotale((byte) 1));
    }
}
