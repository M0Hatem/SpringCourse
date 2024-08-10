package com.springcourse.springcourse.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GameConsole{
    public void up (){
        System.out.println("jump");
    }
    public void down (){
        System.out.println("go into a hole");
    }
    public void left(){
        System.out.println("go back");
    }
    public void right (){
        System.out.println("go foreword");
    }
}
