package com.springcourse.springcourse.game;

public class GameRunner {
    MarioGame game;
    public GameRunner(MarioGame game) {
        this.game= game;
    }

    public void run() {
        System.out.printf("running game %s",game);
    }
}
