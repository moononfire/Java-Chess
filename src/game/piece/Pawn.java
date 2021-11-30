package game.piece;

public class Pawn extends Piece {

    public Pawn(String color) {
        super(color);
    }

    @Override
    public boolean isMoveValid(String startPos, String endPos) {
        return false;
    }
}
