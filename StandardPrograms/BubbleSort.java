import java.util.Scanner;
public class BubbleSort
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Lenght of the Array :");
        int n=input.nextInt();
        int [] arr=new int [n];
        System.out.println("Enter the Elements :");
        //Taking the input in the Array
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        // Logic fot Bubble Sort
        for(int i=0;i<n-1;i++)
        {
            for(int j=i;j<n-1;j++)
            {
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        //Printing the Elements in the Array
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}