package fr.diginamic.essais;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args){
        try{
            final Intervenant SALARIE = new Salarie("Zoé", "Larcher", 456);
            final Intervenant PIGISTE = new Pigiste("Nono", "Oueil", 12, 23.5);
            System.out.printf("Salaire total mensuel du salarié : %f\n",
                    SALARIE.getSalaire());
            System.out.printf("Salaire total mensuel du pigiste : %f\n",
                    PIGISTE.getSalaire());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
