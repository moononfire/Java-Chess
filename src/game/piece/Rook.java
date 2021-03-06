package game.piece;

import game.board.Board;

public class Rook extends Piece {

    public Rook(String color) {
        super(color, "Rook");
    }

    @Override
    public boolean isMoveValid(String startPos, String endPos, Board board) {
        return true;
    }

    @Override
    public String toString() {
        if (color.equals("white")) {
            return "R";
        } else {
            return "2";
        }
    }
}
