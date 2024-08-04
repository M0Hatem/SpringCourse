package com.springcourse.springcourse.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("superQualifier")
public class SuperGame implements GameConsole {
    public void up (){
        System.out.println("up");
    }
    public void down (){
        System.out.println("down");
    }
    public void left(){
        System.out.println("left");
    }
    public void right (){
        System.out.println("right");
    }

}
