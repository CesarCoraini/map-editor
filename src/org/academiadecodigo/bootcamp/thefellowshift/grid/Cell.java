package org.academiadecodigo.bootcamp.thefellowshift.grid;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import static org.academiadecodigo.bootcamp.thefellowshift.Grid.CELL_SIZE;
import static org.academiadecodigo.bootcamp.thefellowshift.Grid.PADDING;

public class Cell {
    private int row;
    private int col;
    private Rectangle rectangle;
    private boolean painted;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;

        rectangle = new Rectangle(col * CELL_SIZE + PADDING, row * CELL_SIZE + PADDING, CELL_SIZE, CELL_SIZE);
        rectangle.draw();
    }
}
