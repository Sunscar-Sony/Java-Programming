import java.util.Scanner;

public class BinarySearch{
    public static void binarySearch(int[]arr, int key){
        int begin=0;
        int end=arr.length-1;
        while(begin<=end){
            int mid=(begin+end)/2;
            if(arr[mid]==key){
                System.out.println("Element Found...");
                break;
            }else if(arr[mid]<key){
                begin=mid+1;
            }else{
                end=mid-1;
            }
        }
        System.out.println("Element not Found...");
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Length of Array :");
        int n=input.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the Elements in Sorted manner in the Array :");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
    }
}