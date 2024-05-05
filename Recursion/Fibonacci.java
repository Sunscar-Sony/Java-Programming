package Recursion;
import java.util.Scanner;
public class Fibonacci {
    public static void fibonacci(int a,int b,int n){
        //Base case
        if(n==0){
            return;
        }
        //My Task to do
        int c=a+b;
        System.out.print(c+" ");
        fibonacci(b, c, n-1);
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of Terms :");
        int n=input.nextInt();
        if(n<=0){System.out.println("Invalid Term");}
        if(n>=1){System.out.print(0+" ");}
        if(n>=2){System.out.print(1+" ");}
        if(n>2){
            fibonacci(0,1,n-2);
        }
    }
}
