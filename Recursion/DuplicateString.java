package Recursion;
import java.util.Scanner;

public class DuplicateString{
    public static boolean[] map=new boolean[26];
    static String newStr="";
    public static void removeDuplicate(String str,int index){
        //Base Case
        if(index==str.length()){
            System.out.println(newStr);
            return;
        }
        //My Task to do.
        char currChar=str.charAt(index);
        if(map[currChar-'a']){
            removeDuplicate(str, index+1);
        }else{
            newStr+=currChar;
            map[currChar-'a']=true;
            removeDuplicate(str, index+1);
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=input.nextLine();
        System.out.println("Result:");
        removeDuplicate(str, 0);
    }
}