package com.game.entities;
import com.game.core.*;
public class Warrior extends Unit {
    public Warrior(String name,int health){
        super(name,health);
    }
    @Override
    public void  attack(){
        System.out.println("warrior attack");
    }
}
