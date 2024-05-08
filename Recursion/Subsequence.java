package Recursion;

import java.util.Scanner;

public class Subsequence{
    static int count=0;
    public static void subsequence(String str, int index,String newStr){
        //Base Case
        if(index==str.length()){
            System.out.println(newStr);
            count+=1;
            return;
        }
        //My Task to do
        char current=str.charAt(index);
        //if it is choose
        subsequence(str, index+1, newStr+current);
        //if not choosen
        subsequence(str, index+1, newStr);
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=input.nextLine();
        System.out.println("Result:"+"\n");
        subsequence(str,0,"");
        System.out.println("Total count : "+count);
    }
}