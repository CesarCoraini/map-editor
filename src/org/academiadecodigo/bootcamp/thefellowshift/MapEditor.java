package org.academiadecodigo.bootcamp.thefellowshift;

import org.academiadecodigo.bootcamp.thefellowshift.grid.Cell;
import org.academiadecodigo.bootcamp.thefellowshift.grid.Cursor;
import org.academiadecodigo.bootcamp.thefellowshift.utils.FileManager;

public class MapEditor {

    private Grid grid;
    private Cursor cursor;
    private boolean paiting;

    public MapEditor(int rows, int cols) {
        grid = new Grid(rows, cols);
        cursor = new Cursor();
    }

    public void moveCursor(Cursor.Direction direction) {

        if (cursorOnEdge(direction)) {
            return;
        }

        switch (direction) {
            case UP:
                cursor.moveUp();
                break;
            case DOWN:
                cursor.moveDown();
                break;
            case LEFT:
                cursor.moveLeft();
                break;
            case RIGHT:
                cursor.moveRight();
                break;
        }

        if(paiting) {
            paintCell();
        }
    }

    public void paintCell() {
        Cell cell = grid.getCells(cursor.getRow(), cursor.getCol());
        if(cell.isPainted()) {
            cell.erase();
        } else {
            cell.paint();
        }
    }

    public void clear() {
        grid.clear();
    }

    public void save() {
        FileManager.writeToFile(grid.toString());
    }

    public void load() {
        grid.stringToGrid(FileManager.readFile());
    }

    public void setPaiting(boolean paiting) {
        this.paiting = paiting;
    }

    private boolean cursorOnEdge(Cursor.Direction direction) {
        return direction == Cursor.Direction.UP && cursor.getRow() == 0 ||
                direction == Cursor.Direction.DOWN && cursor.getRow() == grid.getRows() - 1 ||
                direction == Cursor.Direction.LEFT && cursor.getCol() == 0 ||
                direction == Cursor.Direction.RIGHT && cursor.getCol() == grid.getCols() - 1;
    }
}
