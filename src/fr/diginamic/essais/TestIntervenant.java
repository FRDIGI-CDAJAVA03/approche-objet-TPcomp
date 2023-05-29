package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        Salarie salarie1 = new Salarie("toto", "titi", 1890.44, "CDI");
        System.out.println(salarie1.getSalaire());

        Pigiste pigiste1 = new Pigiste("Tata", "reureu", "Pigiste");
        pigiste1.setNbJoursTravailles(23);
        pigiste1.setMontantJournalier(25.5);
        System.out.println(pigiste1.getSalaire());

        salarie1.afficherDonnees();
        pigiste1.afficherDonnees();
    }
}
