package BitManipulation;
import java.util.Scanner;

public class BinaryToDecimal
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Binary Number :");
        long num=input.nextLong();
        long decimalNumber=0;
        long multiplier=1;
        while(num>0)
        {
            int lastDigit=(int)num%10;
            decimalNumber=decimalNumber+(lastDigit*multiplier);
            multiplier*=2;
            num/=10;
        }
        System.out.println("Result :"+"\n"+ decimalNumber);
    }
}