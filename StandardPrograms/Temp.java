import java.util.Scanner;
public class Temp{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        int greatest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>greatest){
                greatest=arr[i];
            }
        }
        int[] frequency=new int[greatest+1];
        for(int i=0;i<arr.length;i++){
            frequency[arr[i]]+=1;
        }
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