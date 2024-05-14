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

        System.out.println("Enter the Element at Last position");
        list.addLast(input.next());
        list.addLast(input.next());
        list.addLast(input.next());
    }
}