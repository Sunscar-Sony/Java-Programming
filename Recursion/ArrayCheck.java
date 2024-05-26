package Recursion;
import java.util.Scanner;
public class ArrayCheck {
    public static boolean arrayChecker(int[]arr, int index){
        //Base Case
        if(index==arr.length-1){
            return true;
        }
        //My task to do
        if(arr[index]<arr[index+1]){
            return(arrayChecker(arr, index+1));
        }else{
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length of the Array:");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements:");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        if(arrayChecker(arr, 0)){
            System.out.println("Array is Strictly Soreted");
        }else{
            System.out.println("Array is not Strictly Sorted");
        }
    }
}
