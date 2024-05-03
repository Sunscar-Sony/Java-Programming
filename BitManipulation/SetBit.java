package BitManipulation;
import java.util.Scanner;

public class SetBit
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int binaryNumber=input.nextInt();
        System.out.println("Enter the Position :");
        int pos=input.nextInt();
        int bitMask=1<<pos -1;
        bitMask=bitMask | binaryNumber;
        System.out.println(bitMask);
    }
}