import java.util.Scanner;
// A number is palindrome if its reverse is same as the orignal Number
public class Palindrome{

    public static void palindromeNumber(int num)
    {
        int temp=num;
        int reverse=0;
        while(temp>0){
            int digit=temp%10;
            reverse=reverse*10+digit;
            temp=temp/10;
        }
        if(reverse==num){
            System.out.print(reverse +" ");
        }
        return;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Staring Number :");
        int start=input.nextInt();
        System.out.println("Enter the Ending Number :");
        int end=input.nextInt();
        for(int i=start;i<=end;i++)
        {
            palindromeNumber(i);
        }
    }
}