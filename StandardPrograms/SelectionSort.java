import java.util.Scanner;
public class SelectionSort
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
        //Selection sort Logic
        int least=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(arr[j]<arr[least])
                {
                    least=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[least];
            arr[least]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}