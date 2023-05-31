package fr.diginamic.jdr;

import java.util.Scanner;

/**
 * Application dédiée au jeu de rôle.
 * @author alnotz
 */
public class Application {
    private static final String startMenuText = """
                
                0. Créer un personnage
                \u001b[37m1. Combattre une créature
                2. Afficher score\u001b[0m
                3. Sortir
                """;
    private static final String menuText = """
                
                0. Créer un personnage
                1. Combattre une créature
                2. Afficher score
                3. Sortir
                """;
    private static final String creatureMenuText = """
            
            Combattre…
            0. Un loup
            1. Un gobelin
            2. Un ogre
            """;
    private static final String retryText = "Essaye encore…";
    public static void main(String[] args){
        final Scanner input = new Scanner(System.in);
        final Personnage personnage = createPersonnage(input);
        continueWith(input, personnage);
    }
    private static Personnage createPersonnage(Scanner input){
        System.out.println(startMenuText);
        while(input.hasNextLine()){
            final String response = input.nextLine();
            if(response.matches("[03]")){
                switch(response.charAt(0)){
                    case '0' -> {
                        final Personnage personnage = new Personnage();
                        personnage.showStats();
                        System.out.println(menuText);
                        return personnage;
                    }
                    case '3' -> {
                        System.out.println("Au revoir.");
                        System.exit(0);
                    }
                    default -> System.out.println(retryText);
                }
            } else {
                System.out.println(retryText);
            }
        }
        throw new RuntimeException("Unknown loop error.");
    }
    private static void continueWith(Scanner input, Personnage personnage){
        while(input.hasNextLine()){
            final String response = input.nextLine();
            if(response.matches("[0-3]")){
                switch(response.charAt(0)){
                    case '0' -> {
                        personnage = new Personnage();
                        personnage.showStats();
                        System.out.println(menuText);
                    }
                    case '1' -> {
                        Creature creature = selectCreature(input);
                        System.out.println(menuText);
                    }
                    case '2' -> {
                        personnage.showScore();
                        System.out.println(menuText);
                    }
                    case '3' -> {
                        System.out.println("Au revoir.");
                        System.exit(0);
                    }
                    default -> System.out.println(retryText);
                }
            } else {
                System.out.println(retryText);
            }
        }
        throw new RuntimeException("Unknown loop error.");
    }
    private static Creature selectCreature(Scanner input){
        System.out.println(creatureMenuText);
        while(input.hasNextLine()) {
            final String response = input.nextLine();
            if(response.matches("[012]")) {
                switch(response.charAt(0)){
                    case '0' -> {
                        return new Loup();
                    }
                    case '1' -> {
                        return new Gobelin();
                    }
                    case '2' -> {
                        return new Ogre();
                    }
                    default -> System.out.println(retryText);
                }
            }
        }
        throw new RuntimeException("Unknown loop error.");
    }
    private static void fight(Personnage personnage, Creature creature){
        if(personnage.getHealth() <= 0){
            System.out.printf("Votre personnage est décédé. Il a obtenu le" +
                    "score de %d points. Veuillez créer un nouveau personnage",
                    personnage.getScore());
        } else {
            System.out.println("…");
        }
    }
}
