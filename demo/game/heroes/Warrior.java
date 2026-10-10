package demo.game.heroes;
import demo.game.engine.GameEntity;
public class Warrior extends GameEntity {
    public void testAbility(){
        System.out.println(health);
        System.out.println(entityName);
        PhysicalBox pb=new PhysicalBox();
        pb.details();
    }

}
