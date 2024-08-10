package com.springcourse.springcourse.game;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        var superGame = new SuperGame();
//        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(superGame);
        gameRunner.run();
    }
}
