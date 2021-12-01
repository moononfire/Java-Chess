package game.piece;

import game.board.Board;

public abstract class Piece {

    protected String color;

    protected String name;

    public Piece(String color, String name) {
        this.color = color;
        this.name = name;
    }

    //check if the piece moves in this way and if there are any other pieces on the way which would collide.
    //also checks for the case when the piece has a secret move, f.e. if you move a pawn 2 up then it checks if it was already moved and if the move is 2 up etc.
    public abstract boolean isMoveValid(String startPost, String endPos, Board board);

    public String getColor() {
        return color;
    }

    @Override
    public abstract String toString();

    public String getName() {
        return name;
    }
}
