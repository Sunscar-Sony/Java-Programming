import java.util.*;

public class Average
{
    public static int numsAverage(int num1,int num2,int num3)
    {
        int averageans;
        averageans=(num1+num2+num3)/3;
        return averageans;
    }
    public static void main(String[] args)
    {
        Scanner input=newScanner(System.in);
        System.out.println("Enter the number you want to find the Average");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        int ans=numsAverage(num1, num2, num3);
        System.out.println(ans);
    }
}