import java.util.Scanner;
public class MergeArray{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of Array1 :");
        int n1=input.nextInt();
        System.out.println("Enter the lenght of Array2 :");
        int n2=input.nextInt();
        int[]arr=new int[n1];
        int[]brr=new int[n2];
        System.out.println("Enter elements in Array1:");
        for(int i=0;i<n1;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Enter elements in Array 2");
        for(int i=0;i<n2;i++){
            brr[i]=input.nextInt();
        }
    }
}