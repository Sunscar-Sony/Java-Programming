package Recursion;
import java.util.Scanner;

public class StringAppend{
    static String ans="";
    static int count=0;
    public static void appendAtLast(String str, char element, int index){
        //Base Condition
        if(index==str.length()){
            for(int i=0;i<count;i++){
                ans+=element;
            }
            return;
        }
        //My Task to do
        char current=str.charAt(index);
        if(current==element){
            count+=1;
            appendAtLast(str, element, index+1);
        }else{
            ans+=current;
            appendAtLast(str, element, index+1);
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=input.nextLine();
        System.out.println("Enter the Element:");
        char element=input.next().charAt(0);
        appendAtLast(str, element, 0);
        System.out.println("Result :"+"\n"+ans);
    }
}