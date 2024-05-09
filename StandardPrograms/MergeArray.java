import java.util.Scanner;
public class MergeArray{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of Array1 :");
        int n1=input.nextInt();
        System.out.println("Enter the lenght of Array2 :");
        int n2=input.nextInt();
        //Array Decleration.
        int[]arr=new int[n1];
        int[]brr=new int[n2];
        //Taking elements in Array 1
        System.out.println("Enter elements in Array1:");
        for(int i=0;i<n1;i++){
            arr[i]=input.nextInt();
        }
        //Taking elements in Array 2
        System.out.println("Enter elements in Array 2");
        for(int i=0;i<n2;i++){
            brr[i]=input.nextInt();
        }
        int[] crr=new int[n1+n2];
        //merging the Array
        for(int i=0;i<(n1+n2);i++){
            if(i<n1){

                crr[i]=arr[i];
            }else{
                crr[i]=brr[i-n1];
            }
        }
        for(int i=0;i<(n1+n2);i++){
            System.out.println(crr[i]);
        }
    }
}