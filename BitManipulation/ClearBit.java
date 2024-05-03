package BitManipulation;

import java.util.Scanner;

public class ClearBit
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int binaryNumber=input.nextInt();
        System.out.println("Enter the Position :");
        int pos=input.nextInt();
        int bitMask=1<<pos -1;
        
    }
}