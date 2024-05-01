import java.util.Scanner;

public class Arrays
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Size of the Array :");
        int size=input.nextInt();
        int [] ArrayName=new int[size];
        System.out.println("Enter the Elements of the Array :");
        for(int i=0;i<size;i++)
        {
            ArrayName[i]=input.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(ArrayName[i]+", ");
        }

    }
}