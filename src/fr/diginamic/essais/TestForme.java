package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {
    public static void main(String[] args){
        AffichageForme.afficher(new Cercle(12.0));
        AffichageForme.afficher(new Rectangle(4.0, 6.0));
        AffichageForme.afficher(new Carre(3.0));
    }
}
