package polymorphism;

public class methodOverloading {
    public String data(int a, int b){
        return a+" and "+b+" adds up to "+(a+b);
    }
    public String data(String a, String b){
        return a+" and "+b+" adds up to "+a+b;
    }
    public static void main(String[] args) {
        methodOverloading example= new methodOverloading();
        System.out.println(example.data("doraemon","pokimon"));
        System.out.println(example.data(1,2));
    }
}
