package game.piece;

public class Bishop extends Piece {

    public Bishop(String color) {
        super(color);
    }

    @Override
    public boolean isMoveValid(String startPos, String endPos) {
        return false;
    }
}
