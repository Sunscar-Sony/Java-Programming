import java.util.Scanner;
public class Odd
{
    public static void printOddNumber(int n)
    {
        for(int i=1;i<=n;i+=2)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number...");
        int num=input.nextInt();
        printOddNumber(num);
    }
}