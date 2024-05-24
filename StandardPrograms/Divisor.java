import java.util.Scanner;
public class Divisor{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int size=input.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Elements :");
        //Initalizing the Array
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the Divisor :");
        int divisor=input.nextInt();
        //Updating the calue of Array
        for(int i=0;i<size;i++){
            arr[i]/=divisor;
        }
        //Printing the Array
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+", ");
        }
    }
}