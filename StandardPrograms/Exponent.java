import java.util.Scanner;

public class Exponent
{
    public static int exponentPower(int base,int power)
    {
        int ans=1;
        if(power==0)
        {
            ans=0;
        }
        else{
            for(int i=1;i<=power;i++)
            {
                ans=ans*base;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Base of the Number :");
        int base=input.nextInt();
        System.out.println("Enter the Power :");
        int power=input.nextInt();
        int powerAnswer=exponentPower(base, power);
        System.out.println("Final Answer ;"+ powerAnswer);
    }
}