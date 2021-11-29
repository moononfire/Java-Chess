package game.board.field;

import game.board.figure.Piece;

public class Field {

    private Piece piece;

    public boolean isOccupied() {
        return piece != null;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
