package Recursion;
import java.util.Scanner;
public class OcurrenceOfString {
    static int first=-1;
    static int last=-1;
    public static void stringOccurence(String str, int index,char element){
        //Base Case
        if(index==str.length()){
            System.out.println("First Occurence :"+first);
            System.out.println("Last Ocuurence"+last);
            return;
        }
        //My task to do
        char current=str.charAt(index);
        if(current==element){
            if(first==-1){
                first=index;
            }else{
                last=index;
            }
        }
        stringOccurence(str, index+1, element);
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=input.nextLine();
        System.out.println("Enter the Element:");
        char element=input.next().charAt(0);
        stringOccurence(str, 0, element);
    }
}
