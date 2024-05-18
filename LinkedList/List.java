package LinkedList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class List{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        System.out.println("Current List: "+list);
        System.out.println("Enter the no. of Element you wan to insert :");
        //insering the Elements in the List
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            list.add(input.nextInt());
        }
        System.out.println("Current List :"+list+" Size of list :"+list.size());
        //Insering the element in the given position
        System.out.println("Enter the position to insert the element :");
        int pos=input.nextInt();
        list.add(pos,input.nextInt());
        System.out.println(list+ "  "+list.size());
        //Sorting the List
        Collections.sort(list);
        System.out.println("Sorted List :"+list);
        //Deleting the last two elements of the List
        list.removeLast();
        list.removeLast();
        list.removeFirst();
        System.out.println("Printing the List :");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+ " ");
        }

    }
}