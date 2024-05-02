import java.util.Scanner;
public class Greater
{
    public static void findGreaterNumber(int num1,int num2)
    {
        if(num1>num2)
        {
            System.out.println("Greater number is :"+num1);
        }
        else
        {
            System.out.println("Greater number is :"+num2);
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the numbers...");
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        findGreaterNumber(num1,num2);
    }
}