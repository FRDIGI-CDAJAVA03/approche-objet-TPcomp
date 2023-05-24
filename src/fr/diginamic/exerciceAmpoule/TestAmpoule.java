package fr.diginamic.exerciceAmpoule;

import mochizukiTools.Utils;

import java.util.Scanner;

public class TestAmpoule {
    public static void run() {
        Utils.msgTitle("EXERCICE 1 : AMPOULE");
        Ampoule energizer = new Ampoule();
        Utils.msgPrompt("Appuyez sur ENTREE pour basculer l'interrupteur de la lampe");
        while (true) {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            Utils.msgPrompt("ON/OFF: touche ENTREE  QUIT: touche q");

            String inputUser = myObj.nextLine();  // Read user input
            if (inputUser.isEmpty()) energizer.clic();
            else if (inputUser.equals("q") || inputUser.equals("Q")) break;
        }
        Utils.msgInfo("Au revoir...");
    }
}
