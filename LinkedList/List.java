package LinkedList;

import java.util.Scanner;
import java.util.ArrayList;

public class List{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        System.out.println("Enter the number of items in the List you want :");
        int size=input.nextInt();
        for(int i=0;i<size;i++){
            list.add(input.nextInt());
        }
        for(int i=0;i<size;i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println(list);
    }
}