package Recursion;
import java.util.Scanner;

public class Factorial {
    static int ans=1;
    public static void fact(int num){
        //Base Case
        if(num==0)
        {
            System.out.println("Result :"+"\n"+ans);
            return;
        }
        //My Task to do
        ans*=num;
        fact(num-1);
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=input.nextInt();
        fact(num);
    }
}
