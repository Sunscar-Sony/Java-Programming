package BitManipulation;
import java.util.*;

public class DecimalToBinary
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=input.nextInt();
        StringBuilder str=new StringBuilder("");
        while(num>0)
        {
            if(num%2==0){
                str.insert(0,"0");
            }
            else{
                str.insert(0, "1");
            }
            num/=2;
        }
        System.out.println(str);
        System.out.println("Hello");
    }
}
