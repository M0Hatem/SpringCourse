package com.springcourse.springcourse;

import com.springcourse.springcourse.game.GameRunner;
import com.springcourse.springcourse.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
