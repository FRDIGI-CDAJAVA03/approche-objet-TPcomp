package fr.diginamic.essais;

import fr.diginamic.entites.*;

public class TestTheatrePro {
    public static void main(String[] args){
        final TheatrePro THEATRE_PRO = new TheatrePro("Comédie française");
        try{
            THEATRE_PRO.ajouterSpectacle("Et paf le chien!", 0, 123.0, 23);
            THEATRE_PRO.ajouterSpectacle("Zozo le zozio", SpectacleType.COMEDIE, 849.2, 12);
            //THEATRE_PRO.ajouterSpectacle("Zozo le zozio", SpectacleType.DANSE, 1.35, 78);
            THEATRE_PRO.ajouterSpectacle("Un vélo? Quel vélo?", SpectacleType.IMPROVISATION, 2, 137);
            THEATRE_PRO.inscrire(21, "Et paf le chien!");
            THEATRE_PRO.inscrire(8, "Zozo le zozio");
            //THEATRE_PRO.inscrire(15657, "Dodo la saumure");
            System.out.printf("La troupe de théâtre \u001b[34m%s\u001b[0m a fait une recette " +
                            "de \u001b[34m%.2f\u001b[0m € avec ses \u001b[34m%d\u001b[0m spectatrices.\n",
                    THEATRE_PRO.getNom(),
                    THEATRE_PRO.getRecetteTotale(),
                    THEATRE_PRO.getClientsTotal());
        } catch(KeyAlreadyExistsException | KeyDoesNotExistException | OutOfLimitNumberException ex) {
            ex.printStackTrace();
        }
    }
}
