package fr.diginamic.maison;

public class Cuisine extends Piece{
    public Cuisine(double superficie, byte etage) {
        super(superficie, etage);
    }
    @Override
    int getType() {
        return 3;
    }
}