package LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

public class List{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("Current List: "+list);
        System.out.println("Enter the no. of Element you wan to insert :");
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            list.add(input.nextInt());
        }
        System.out.println("Current List :"+list+" Size of list :"+list.size());
        System.out.println("Enter the position to insert the element :");
        int pos=input.nextInt();
        list.add(pos,input.nextInt());
        System.out.println(list+ "  "+list.size());
    }
}