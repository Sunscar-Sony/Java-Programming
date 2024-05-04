import java.util.Scanner;
public class InsertionSort 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the lenght of array :");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        // Insertion Sort
        for(int i=1;i<n;i++)
        {
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current)
            {
                arr[j+1]=arr[j];
                j-=1;
            }
            arr[j+1]=current;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
