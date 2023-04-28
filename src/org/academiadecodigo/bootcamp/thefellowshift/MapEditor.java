package org.academiadecodigo.bootcamp.thefellowshift;

import org.academiadecodigo.bootcamp.thefellowshift.grid.Cursor;

public class MapEditor {

    private Grid grid;
    private Cursor cursor;
    private boolean paiting;

    public MapEditor(int rows, int cols) {
        grid = new Grid(rows, cols);
        cursor = new Cursor();
    }
}
