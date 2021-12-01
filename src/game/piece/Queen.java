package game.piece;

public class Queen extends Piece {

    public Queen(String color) {
        super(color, "Queen");
    }

    @Override
    public boolean isMoveValid(String startPos, String endPos) {
        return true;
    }

    @Override
    public String toString() {
        if (color.equals("white")) {
            return "Q";
        } else {
            return "5";
        }
    }
}
