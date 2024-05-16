kopackage LinkedList;
import java.util.Scanner;

public class ScratchLinkedList{
    node head;
    public class node{
        String data;
        node next;
        //Constructor
        node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void printList(node head){
        node current=head;
        while(current.next!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public void addFirst(String data){
        node newNode=new node(data);
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }
    public static void main(String[] args){
        ScratchLinkedList list = new ScratchLinkedList();
        Scanner input=new Scanner(System.in);
        list.addFirst(input.next());
        System.out.println("Hello World!")
    }
}