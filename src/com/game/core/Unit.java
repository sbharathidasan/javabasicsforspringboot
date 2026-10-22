package com.game.core;

public class Unit {
    private String name;
    private int health;
    public Unit(String name, int health){
        this.name=name;
        this.health=health;
    }
    public void attack(){
        System.out.println("attacker log ");
    }
} 

