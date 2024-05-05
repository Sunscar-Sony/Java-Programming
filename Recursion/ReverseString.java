package Recursion;
import java.util.Scanner;
public class ReverseString {
    public static void reverse(String str,int index){
        //Base Case
        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }
        //My Task
        System.out.print(str.charAt(index)+" ");
        reverse(str, index-1);
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=input.nextLine();
        reverse(str,str.length()-1);
    }
}
