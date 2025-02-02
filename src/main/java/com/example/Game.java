package com.example;

import java.awt.event.KeyEvent;

public class Game {

    public int time;

    public Game() {
    }

    public void tick(boolean[] key) {
        time++;
        boolean forward = key[KeyEvent.VK_W];
        boolean back = key[KeyEvent.VK_S];
        boolean left = key[KeyEvent.VK_A];
        boolean right = key[KeyEvent.VK_D];
    }
}
