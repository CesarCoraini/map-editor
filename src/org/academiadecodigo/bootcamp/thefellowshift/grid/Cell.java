package org.academiadecodigo.bootcamp.thefellowshift.grid;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import static org.academiadecodigo.bootcamp.thefellowshift.Grid.CELL_SIZE;
import static org.academiadecodigo.bootcamp.thefellowshift.Grid.PADDING;

public class Cell {
    protected int row;
    protected int col;
    protected Rectangle rectangle;
    private boolean painted;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;

        rectangle = new Rectangle(col * CELL_SIZE + PADDING, row * CELL_SIZE + PADDING, CELL_SIZE, CELL_SIZE);
        rectangle.draw();
    }

    public void paint() {
        painted = true;
        rectangle.fill();
    }

    public void erase() {
        painted = false;
        rectangle.draw();
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public boolean isPainted() {
        return painted;
    }

    @Override
    public String toString() {
        return painted ? "1" : "0";
    }
}
