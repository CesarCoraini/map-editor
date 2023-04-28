package org.academiadecodigo.bootcamp.thefellowshift.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;

import static org.academiadecodigo.bootcamp.thefellowshift.Grid.CELL_SIZE;

public class Cursor extends Cell{

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public Cursor() {
        super(0, 0);
        rectangle.setColor(Color.RED);
        paint();
    }

    public void moveUp() {
        row --;
        rectangle.translate(0, -CELL_SIZE);
    }

    public void moveDown() {
        row ++;
        rectangle.translate(0, CELL_SIZE);
    }

    public void moveLeft() {
        col --;
        rectangle.translate(-CELL_SIZE, 0);
    }

    public void moveRight() {
        col ++;
        rectangle.translate(CELL_SIZE, 0);
    }
}
