package Recursion;

import java.util.Scanner;
public class Printing{
    public static void printNum(int num){
        // Base Case
        if(num==0){
            return;
        }
        //Doing my Task thinking rest Task will be done by the recusrisve call
        System.out.print(num+" ");
        // Recursive function Calling
        printNum(num-1);
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=input.nextInt();
        printNum(num);
    }
}