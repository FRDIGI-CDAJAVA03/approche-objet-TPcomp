package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

/**
 * Afficheur de forme géométrique.
 */
public class AffichageForme {
    /**
     * Afficher aire et périmètre d’une forme géométrique.
     * @param forme Forme géométrique
     */
    public static void afficher(Forme forme){
        System.out.printf("{aire: %f, périmètre: %f}\n", forme.calculerSurface(), forme.calculerPerimetre());
    }
}
