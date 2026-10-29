package polymorphism;

public class methodOverriding{
    class Animal{
        void speak(){
            System.out.println("this is the default and common voice");
        }
        void type(){
            System.out.println("this is a default value from parent ");
        }
    }
    class dog extends Animal{
        @Override 
        void speak(){
            System.out.println("this is the dog class which barks");

        }
        @Override 
        void type(){
            System.out.println("this is domestic animal human friendly");
        } 
    } 
    class tiger extends Animal{
        @Override 
        void speak(){
            System.out.println("this is the tiger class which roars");

        }
        @Override 
        void type(){
            System.out.println("this is wild animal and copy its not human human friendly");
        } 
        } 
        public static void main(String[] args) {
            // this is upcasting which also comes under runtime polymorphism 
            methodOverriding mo=new methodOverriding();
            methodOverriding.Animal ani=mo.new Animal();
            ani.speak();
            methodOverriding.Animal dog=mo.new dog();
            dog.speak();
            methodOverriding.Animal tiger=mo.new tiger();
            tiger.speak();
        }
        
    }