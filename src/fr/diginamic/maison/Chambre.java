package fr.diginamic.maison;

public class Chambre extends Piece{
    public Chambre(double superficie, byte etage) {
        super(superficie, etage);
    }
    @Override
    int getType() {
        return 1;
    }
}
