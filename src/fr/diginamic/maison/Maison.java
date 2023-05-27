package fr.diginamic.maison;

public class Maison {
    private Piece[] pieces;
    public Maison(){
        this.pieces = new Piece[]{};
    }
    public void ajouterPiece(Piece piece){
        try{
            if(piece == null){
                throw new NullPointerException("\u001b[33mAVERTISSEMENT : " +
                        "Une pièce est ignorée car elle ne doit pas être nulle!\u001b[0m");
            }
            Piece[] extension = new Piece[this.pieces.length + 1];
            System.arraycopy(this.pieces, 0, extension, 0, this.pieces.length);
            extension[extension.length - 1] = piece;
            this.pieces = extension;
        } catch(NullPointerException ex) {
            System.err.println(ex.getLocalizedMessage());
        }

    }
    public double getSuperficieTotale(){
        double superficieTotale = 0.0;
        for(Piece piece: this.pieces){
            superficieTotale += piece.getSuperficie();
        }
        return superficieTotale;
    }
    public double getSuperficieTotale(byte etage){
        double superficieTotale = 0.0;
        for(Piece piece: this.pieces){
            if(piece.getEtage() == etage){
                superficieTotale += piece.getSuperficie();
            }
        }
        return superficieTotale;
    }
}
