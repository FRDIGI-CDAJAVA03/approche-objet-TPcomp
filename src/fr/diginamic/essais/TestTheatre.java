package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args){
        final Theatre THEATRE = new Theatre("Theatre", 128);
        for(int i=0; i<128; i++){
            try{
                THEATRE.inscrire(16, 120);
            } catch (Error err){
                break;
            }
        }
        System.out.printf("Total de clients : %d\n", THEATRE.getClients());
        System.out.printf("Total de recette : %d\n", THEATRE.getRecette());
    }
}
