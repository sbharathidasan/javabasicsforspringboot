package linked.doublylinkedlist;
public class Main{
public static void main(String[] args) {
    doublylinkedlist d=new doublylinkedlist();
    d.insertAtEnd("5");
    d.insertAtEnd("hello");
    d.traverseforward();
    d.insertAtposition("1",4);
    d.traverseforward();
}
}