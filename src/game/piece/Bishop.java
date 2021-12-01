package game.piece;

public class Bishop extends Piece {

    public Bishop(String color) {
        super(color, "Bishop");
    }

    @Override
    public boolean isMoveValid(String startPos, String endPos) {
        return true;
    }

    @Override
    public String toString() {
        if (color.equals("white")) {
            return "B";
        } else {
            return "3";
        }
    }
}
