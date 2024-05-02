import java.util.Scanner;

public class Average
{
    public static int averageFunction(int num1,int num2,int num3)
    {
        int averageSum=(num1+num2+num3)/3;
        return (averageSum);
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the Numbers...");
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        System.out.println(averageFunction(num1,num2,num3));
    }
}