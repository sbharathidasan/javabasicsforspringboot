package demo.game.engine;

public class GameEntity {
    protected int health=100;
    public String entityName="generic";
    protected class PhysicalBox{
        public PhysicalBox(){

        }
        public void details(){
            System.out.println(health +" health "+entityName +"entity ");
        }
    }
}
