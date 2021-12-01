package game.piece;

import game.board.Board;

public class King extends Piece {

    public King(String color) {
        super(color, "King");
    }

    @Override
    public boolean isMoveValid(String startPos, String endPos, Board board) {
        return true;
    }

    @Override
    public String toString() {
        if (color.equals("white")) {
            return "K";
        } else {
            return "6";
        }
    }
}
