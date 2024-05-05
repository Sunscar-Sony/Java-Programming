package Recursion;
import java.util.Scanner;
public class Sum
{
    public static void printSum(int i,int num,int sum)
    {
        //Base Case
        if(i==num){
            sum+=num;
            System.out.println("Result :"+"\n"+sum);
            return;
        }
        //My Task to do
        sum=sum+i;
        printSum(i+1, num, sum);
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=input.nextInt();
        printSum(1, num, 0);
    }
}