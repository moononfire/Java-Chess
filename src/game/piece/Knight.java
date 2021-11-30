package game.piece;

public class Knight extends Piece {

    public Knight(String color) {
        super(color);
    }

    @Override
    public boolean isMoveValid(String startPos, String endPos) {
        return false;
    }
}
