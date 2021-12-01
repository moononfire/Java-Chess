package game.piece;

import game.board.Board;

public class Knight extends Piece {

    public Knight(String color) {
        super(color, "Knight");
    }

    @Override
    public boolean isMoveValid(String startPos, String endPos, Board board) {
        return true;
    }

    @Override
    public String toString() {
        if (color.equals("white")) {
            return "N";
        } else {
            return "4";
        }
    }
}
