import java.util.Scanner;

public class GCD
{
    static int gcd=1;
    public static void greaterCommonDivisor(int num1, int num2)
    {
        int small;
        int large;
        if(num1>num2){
            small=num2;
            large=num1;
        }
        else{
            small=num1;
            large=num2;
        }
        for(int i=1;i<=small;i++)
        {
            if(large%i==0 && small%i==0){
                gcd=i;
            }
        }
        return;
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the First Number :");
        int num1=input.nextInt();
        System.out.println("Enter the Second Number :");
        int num2=input.nextInt();
        greaterCommonDivisor(num1, num2);
        System.out.println("Result :"+ gcd);
    }
}