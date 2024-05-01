import java.util.Scanner;
public class MatrixArray
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number of Rows :");
        int row=input.nextInt();
        System.out.println("Enter the Number of Coloumn :");
        int coloumn=input.nextInt();
        int [][] userArray=new int[row][coloumn];
        System.out.println("Enter the Elements in the Array :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
                userArray[i][j]=input.nextInt();
            }
        }
        System.out.println("Your Input Array is :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
                System.out.print(userArray[i][j] + " ");
            }
        }
    }
}