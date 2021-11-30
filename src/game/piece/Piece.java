package game.piece;

public abstract class Piece {

    protected String color;

    public Piece(String color) {
        this.color = color;
    }

    public abstract boolean isMoveValid(String startPost, String endPos);

    public String getColor() {
        return color;
    }
}
