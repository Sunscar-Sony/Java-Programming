import java.util.Scanner;
public class Sunny{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=input.nextInt();
        int temp=num+1;
        int x=(int)Math.sqrt(temp);
        if(x*x==temp){
            System.out.println("The Number is Sunny...");
        }else{
            System.out.println("Not Sunny");
        }
    }
}