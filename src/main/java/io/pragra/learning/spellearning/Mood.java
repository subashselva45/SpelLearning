package io.pragra.learning.spellearning;

import org.springframework.stereotype.Component;

@Component
public class Mood {
    public int getMood(){
        return 40;
    }
    public void display(){
        System.out.println("display");
    }
}
