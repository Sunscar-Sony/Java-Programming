package BitManipulation;

import java.util.Scanner;

public class GetBit
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int binaryNumber=input.nextInt();
        System.out.println("Enter the position from last :");
        int pos=input.nextInt()-1;
        int BitMask=1<<pos;
        BitMask=BitMask & binaryNumber;

        if(BitMask==0){
            System.out.println("Result : 0");
        }
        else{
            System.out.println("Result : 1");
        }
    }
}