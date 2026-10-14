package linked.doublylinkedlist;

public class doublylinkedlist {
    node head;
    node tail;
    public doublylinkedlist(){
        this.head=null;
        this.tail=null;
    }
    public void traverseforward(){
        node current = head;
        while(current !=null){
            System.out.print(current.data+"");
            current =current.next;
        }
           
    }
    public void traversebackward(){
        node current =tail;
        while(current!=null){
            System.out.print(current.data+"");
            current=current.prev;
        }
    }
    public void insertAtHead(String data){
        node niw=new node(data);
        if(head==null){
            head=niw;
            tail=niw;
        }
        else{
            niw.next=head;
            head.prev=niw;
            head=niw;
        }
    }
    public void insertAtposition(String data, int position){
        node niw=new node(data);
        if(position==1){
            insertAtHead(data);
        }
        else{
            node current=head;
            int currentPosition=1;
            while(current!=null && currentPosition<position){
                current=current.next; 
                currentPosition++;
            }
            if(current==null){
                insertAtEnd(data);
            }
            else{
                niw.prev=current.prev;
                current.prev.next=niw;
                current.prev=niw;
                niw.next=current;
            }
        }
    }
    public void insertAtEnd(String data){
        node niw=new node(data);
        if(tail==null){
            head=niw;
            tail=niw;
        }
        else{
            tail.next=niw;
            niw.prev=tail;
            tail=niw;
        }
    }

}
