package fr.diginamic.maison;

public class Salon extends Piece{
    public Salon(double superficie, byte etage) {
        super(superficie, etage);
    }
    @Override
    int getType() {
        return 2;
    }
}