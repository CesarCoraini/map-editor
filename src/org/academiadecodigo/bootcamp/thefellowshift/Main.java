package org.academiadecodigo.bootcamp.thefellowshift;

import org.academiadecodigo.bootcamp.thefellowshift.utils.KeyboardController;

public class Main {
    public static void main(String[] args) {

        MapEditor mapEditor = new MapEditor(20, 20);
        new KeyboardController(mapEditor);
    }
}
