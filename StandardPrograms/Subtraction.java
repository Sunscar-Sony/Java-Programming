import java.util.Scanner;

public class Subtraction{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the lenght of First Matrix");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements in the Array :");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
    }
}