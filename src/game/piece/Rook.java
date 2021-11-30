package game.piece;

public class Rook extends Piece {

    String color;
    public Rook(String color) {
        super(color);
    }

    @Override
    public boolean isMoveValid(String startPos, String endPos) {
        return false;
    }
}
