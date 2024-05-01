import java.util.Scanner;
public class MatrixAddition
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number of Row :");
        int row=input.nextInt();
        System.out.println("Enter the Number of Coloumn :");
        int col=input.nextInt();
        int [][] Matrix1=new int[row][col];
        int [][] Matrix2=new int[row][col];
        System.out.println("Enter the Elements in First Matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                Matrix1[i][j]=input.nextInt();
            }
        }
        System.out.println("Enter the Elements in Second Matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                Matrix2[i][j]=input.nextInt();
            }
        }
    }
}