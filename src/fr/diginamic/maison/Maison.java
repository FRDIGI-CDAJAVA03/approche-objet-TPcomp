package fr.diginamic.maison;

/** Maison contenant plusieurs pièces */
public class Maison {
    /** Ensemble des pièces contenues dans la maison */
    private Piece[] pieces;

    /**
     * Construit une nouvelle maison sans pièce.
     */
    public Maison(){
        this.pieces = new Piece[]{};
    }

    /**
     * Ajouter une nouvelle pièce dans la maison.
     * @param piece Pièce
     */
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
    /**
     * Obtenir la superficie totale de la maison.
     * @return Aire de superficie
     */
    public double getSuperficieTotale(){
        double superficieTotale = 0.0;
        for(Piece piece: this.pieces){
            superficieTotale += piece.getSuperficie();
        }
        return superficieTotale;
    }

    /**
     * Obtenir la superficie totale d’un étage de la maison.
     * @param etage Numéro d’étage
     * @return Aire de superficie
     */
    public double getSuperficieTotale(byte etage){
        double superficieTotale = 0.0;
        for(Piece piece: this.pieces){
            if(piece.getEtage() == etage){
                superficieTotale += piece.getSuperficie();
            }
        }
        return superficieTotale;
    }
    /**
     * Obtenir la superficie totale d’un type de pièce de la maison.
     * @param type Numéro de type de pièce
     * @return Aire de superficie
     */
    public double getSuperficieTotale(int type){
        double superficieTotale = 0.0;
        for(Piece piece: this.pieces){
            if(piece.getType() == type){
                superficieTotale += piece.getSuperficie();
            }
        }
        return superficieTotale;
    }
    /**
     * Obtenir la superficie totale d’un type de pièce de la maison.
     * @param type Type de pièce
     * @return Aire de superficie
     */
    public double getSuperficieTotale(PieceType type){
        double superficieTotale = 0.0;
        for(Piece piece: this.pieces){
            if(piece.getType() == type.value()){
                superficieTotale += piece.getSuperficie();
            }
        }
        return superficieTotale;
    }
    /**
     * Obtenir le nombre de pièces d’un même type.
     * @param type Numéro de type de pièce
     * @return Nombre de pièces
     */
    public int getNombreDePieces(int type){
        int nombreTotal = 0;
        for(Piece piece: this.pieces){
            if(piece.getType() == type){
                nombreTotal++;
            }
        }
        return nombreTotal;
    }
    /**
     * Obtenir le nombre de pièces d’un même type.
     * @param type Type de pièce
     * @return Nombre de pièces
     */
    public int getNombreDePieces(PieceType type){
        int nombreTotal = 0;
        for(Piece piece: this.pieces){
            if(piece.getType() == type.value()){
                nombreTotal++;
            }
        }
        return nombreTotal;
    }
}
