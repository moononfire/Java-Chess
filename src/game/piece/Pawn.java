package game.piece;

public class Pawn extends Piece {

    public Pawn(String color) {
        super(color, "Pawn");
    }

    @Override
    public boolean isMoveValid(String startPos, String endPos) {
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
