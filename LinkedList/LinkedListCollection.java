package LinkedList;

import java.util.Scanner;
import java.util.LinkedList;

public class LinkedListCollection{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        LinkedList<String>list=new LinkedList<String>();

        System.out.println("Enter the Element at first position");
        list.addFirst(input.next());
        list.addFirst(input.next());
        list.addFirst(input.next());
        System.out.println("Linked List :"+list);

        System.out.println("Enter the Element at Last position");
        list.addLast(input.next());
        list.addLast(input.next());
        list.addLast(input.next());
        System.out.println("Linked List :"+list);

        System.out.println("Enter the Element at Specific postion");
        list.add(input.nextInt(), input.next());
        list.add(input.nextInt(), input.next());
        list.add(input.nextInt(), input.next());
        System.out.println("Linked List :"+list);

        System.out.println("Deletion :");
        list.remove(3);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println(list.size());

        int size=list.size();
        System.out.println(size);
    }
}