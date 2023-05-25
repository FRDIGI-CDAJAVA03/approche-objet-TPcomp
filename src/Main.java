import fr.diginamic.exerciceAmpoule.TestAmpoule;
import fr.diginamic.exerciceCercle.TestCercle;
import fr.diginamic.exerciceFacture.TestFacture;
import mochizukiTools.Params;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Params.welcomePrompt();
        TestAmpoule.run();
        TestCercle.run();
        TestFacture.run();
    }
}