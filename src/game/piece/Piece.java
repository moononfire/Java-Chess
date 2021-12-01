package game.piece;

public abstract class Piece {

    protected String color;

    protected String name;

    public Piece(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public abstract boolean isMoveValid(String startPost, String endPos);

    public String getColor() {
        return color;
    }

    @Override
    public abstract String toString();

    public String getName() {
        return name;
    }
}
