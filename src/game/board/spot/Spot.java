package game.board.spot;

import game.piece.Piece;

public class Spot {

    private Piece piece;

    public boolean isOccupied() {
        return piece != null;
    }

    public boolean isFree() {
        return !isOccupied();
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
