package Recursion;
import java.util.Scanner;

class pattern{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i%j==0){
                    System.out.print(" * ");
                }
                System.out.print('\n');
            }
        }
    }
}