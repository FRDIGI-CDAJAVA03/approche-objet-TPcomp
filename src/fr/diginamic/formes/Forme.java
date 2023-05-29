package fr.diginamic.formes;

/** Classe mère de différentes formes géométriques. */
public abstract class Forme {
    /**
     * Méthode pour l’aire de surface de la forme.
     * @return Aire de surface
     */
    public abstract double calculerSurface();
    /**
     * Méthode pour le périmètre de la forme.
     * @return Périmètre
     */
    public abstract double calculerPerimetre();
}
