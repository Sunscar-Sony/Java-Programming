package Recursion;
import java.util.Scanner;

public class Exponent
{
    static int ans=1;
    public static int power(int x,int n){
        //Base Case
        if(n==0){
            return 1;
        }
        //My task to do
        int temp=power(x, n-1);
        ans=x*temp;
        return ans;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the valur for x :");
        int x=input.nextInt();
        System.out.println("Enter the value for n :");
        int n=input.nextInt();
        int number=power(x, n);
        System.out.println("Result :"+ans);
    }
}