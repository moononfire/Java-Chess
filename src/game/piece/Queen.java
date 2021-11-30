package game.piece;

public class Queen extends Piece {

    public Queen(String color) {
        super(color);
    }

    @Override
    public boolean isMoveValid(String startPos, String endPos) {
        return false;
    }
}
