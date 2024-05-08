package Recursion;

import java.util.Scanner;

public class Subsequence{
    public static void subsequence(String str, int index,int newStr){
        //Base Case
        if(index==str.length()){
            System.out.println(newStr);
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
    }
}