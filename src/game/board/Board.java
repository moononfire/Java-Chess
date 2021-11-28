package game.board;

import game.board.field.Field;

public class Board {

    Field[] rows;
    Field[] columns;

    public Board() {
        this.rows = new Field[8];
        this.columns = new Field[8];
    }

}
