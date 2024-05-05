package Recursion;
import java.util.Scanner;

public class Factorial {
    public static int fact(int num){
        //Base Case
        if(num==0 || num==1){
            return 1;
        }
        //My Task to do
        int temp=fact(num-1);
        int ans=num*temp;
        return ans;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=input.nextInt();
        int factorial=fact(num);
        System.out.println("Result :"+"\n"+factorial);
    }
}
