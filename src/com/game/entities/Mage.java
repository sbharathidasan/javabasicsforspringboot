package com.game.entities;
import com.game.core.*;
public class Mage extends Unit {
     public Mage(String name,int health){
        super(name,health);
    }
    @Override 
    public void attack(){
        System.out.println("this is Mage attack");
    }
}
