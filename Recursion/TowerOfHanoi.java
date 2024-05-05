package Recursion;
import java.util.Scanner;

public class TowerOfHanoi
{
    public static void TOH(String source, String helper, String destination,int n)
    {
        //Base Case
        if(n==1){
            System.out.println("Move disk "+n+" from "+source+" to "+destination);
            return;
        }
        //My Task to do
        TOH(source,destination,helper,n-1);
        System.out.println("Move disk "+n+" from "+source+" to "+destination);
        TOH(helper,source,destination,n-1);
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of disk :");
        int n=input.nextInt();
        TOH("S","H","D",n);
        System.out.println("\n"+"Congratualtion puzzle solved...");
    }
}