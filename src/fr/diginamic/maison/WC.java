package fr.diginamic.maison;

public class WC extends Piece{
    public WC(double superficie, byte etage) {
        super(superficie, etage);
    }
    @Override
    int getType() {
        return 5;
    }
}