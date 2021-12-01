package game.piece;

import game.board.Board;

public class Pawn extends Piece {

    private boolean wasMoved;

    public Pawn(String color) {
        super(color, "Pawn");
        this.wasMoved = false;
    }

    @Override
    public boolean isMoveValid(String startPos, String endPos, Board board) {
        return true;
    }

    @Override
    public String toString() {
        if (color.equals("white")) {
            return "P";
        } else {
            return "1";
        }
    }
}
