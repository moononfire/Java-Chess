package game.board;

import game.board.field.Field;
import util.Util;

import java.util.HashMap;
import java.util.Map;

public class Board {

    Map<String, Field> fields;

    public Board() {
        fields = new HashMap<>();

        for (int i = 1; i <= 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                fields.put(Util.transformIndex(j + 1) + i, new Field());
            }
        }
    }

    public Field getField(String XY) {
        return fields.get(XY);
    }
}
