package fr.diginamic.jdr;

import java.util.Scanner;

/**
 * Application dédiée au jeu de rôle.
 * @author FYHenry
 */
public class Application {
    /** Texte du menu de démarrage */
    private static final String startMenuText = """
                
                0. Créer un personnage
                \u001b[37m1. Combattre une créature
                2. Afficher score\u001b[0m
                3. Sortir
                """;
    /** Texte du menu principal */
    private static final String menuText = """
                
                0. Créer un personnage
                1. Combattre une créature
                2. Afficher score
                3. Sortir
                """;
    /** Texte du menu de combat */
    private static final String creatureMenuText = String.format("""
            
            Créature à combattre:
            0. %s
            1. %s
            2. %s
            """,
            new Loup().getType(),
            new Gobelin().getType(),
            new Troll().getType());
    /** Texte de tentative nouvelle */
    private static final String retryText = "Essaye encore…";

    /**
     * Méthode principale de l’application.
     * @param args Arguments
     */
    public static void main(String[] args){
        final Scanner input = new Scanner(System.in);
        final Personnage personnage = createPersonnage(input);
        continueWith(input, personnage);
    }

    /**
     * Créer un personnage.
     * @param input Scanner
     * @return Personnage
     */
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

    /**
     * Continuer avec ce personnage.
     * @param input Scanner
     * @param personnage Personnage
     */
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
                        final Creature creature = selectCreature(input);
                        creature.showStats();
                        if(personnage.getHealth() <= 0){
                            System.out.printf("Votre personnage est décédé. Il a obtenu le" +
                                            "score de %d points. Veuillez créer un nouveau personnage",
                                    personnage.getScore());
                        } else {
                            final boolean SUCCESS = winTheFight(personnage, creature);
                            if(SUCCESS) {
                                personnage.growScore(creature.dropScore());
                            }
                        }
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

    /**
     * Sélectionner la créature.
     * @param input Scanner
     * @return Créature
     */
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
                        return new Troll();
                    }
                    default -> System.out.println(retryText);
                }
            }
        }
        throw new RuntimeException("Unknown loop error.");
    }

    /**
     * Combattre contre la créature.
     * @param personnage Personnage
     * @param creature Créature
     * @return Véracité d’une victoire
     */
    private static boolean winTheFight(Personnage personnage, Creature creature){
        while(personnage.getHealth() > 0 && creature.getHealth() > 0){
            int personnageAttack = personnage.getForce() + (int) (Math.random() * 9 + 1);
            int creatureAttack= creature.getForce() + (int) (Math.random() * 9 + 1);
            while(personnageAttack == creatureAttack){
                personnageAttack = personnage.getForce() + (int) (Math.random() * 9 + 1);
                creatureAttack= creature.getForce() + (int) (Math.random() * 9 + 1);
            }
            if(personnageAttack < creatureAttack){
                personnage.looseHealth(creatureAttack);
                System.out.printf("%s vous inflige %d points de dégât.\n",
                        creature.getType(),
                        creatureAttack);
                if(personnage.getHealth() > 0){
                    System.out.printf("Vous tenez bon avec %d/%d points de santé.\n",
                            personnage.getHealth(),
                            personnage.getHealthMax());
                } else {
                    System.out.println("Vous avez rendu l’âme.");
                }
            } else {
                creature.looseHealth(personnageAttack);
                System.out.printf("Vous infligez %d points de dégât à %s.\n",
                        personnageAttack,
                        creature.getType());
                if(creature.getHealth() > 0){
                    System.out.printf("%s tient bon avec %d/%d points de santé.\n",
                            creature.getType(),
                            creature.getHealth(),
                            creature.getHealthMax());
                } else {
                    System.out.println("Votre adversaire a rendu l’âme.");
                }
            }
        }
        return personnage.getHealth() > 0;
    }
}
