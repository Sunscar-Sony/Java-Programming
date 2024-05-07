import java.util.Scanner;
public class ArrayAverage{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Lenght of the Array:");
        int n=input.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int ans=sum/n;
        System.out.println(ans);
    }
}