package com.springcourse.springcourse.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private final GameConsole game;
    public GameRunner(@Qualifier("superQualifier") GameConsole game) {
        this.game= game;
    }

    public void run() {
        System.out.printf("running game %s%n",game);
        game.down();
    }
}
