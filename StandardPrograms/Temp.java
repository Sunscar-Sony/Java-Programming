import java.util.Scanner;
public class Temp{
    //Code to Equalize an Array
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Size of the Array :");
        int size=input.nextInt();
        int[] arr=new int[size];
        //Taking the input of the Array
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        //Finding the greatest Element in the Array
        int greatest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>greatest){
                greatest=arr[i];
            }
        }
        //Frequency Array for calculating the Frequency of ach element
        int[] frequency=new int[greatest+1];
        for(int i=0;i<arr.length;i++){
            frequency[arr[i]]+=1;
        }
        //Finding the greatest Element in the frequency Array
        int temp=0;
        for(int i=0;i<frequency.length;i++){
            if(frequency[i]>temp){
                temp=frequency[i];
            }
        }
        int result=size-temp;
        System.out.println(result);
    }
}