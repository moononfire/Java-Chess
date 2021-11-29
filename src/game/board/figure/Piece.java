package game.board.figure;

public abstract class Piece {

    protected String color;

    public Piece(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
