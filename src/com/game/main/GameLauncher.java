package com.game.main;
import com.game.core.Unit;
import com.game.entities.Mage;
import com.game.entities.Warrior;
public class GameLauncher{
    public static void main(String[] args) {
        System.out.println("main class");
        Unit[] role={new Mage("wizard",80),new Warrior("spartan",70)};
        for(int i =0; i<role.length;i++){
            role[i].attack();
        }
    }
}
