import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number of Terms :");
        int num=input.nextInt();
        int first=0;
        int second=1;
        int third;
        if(num<=0){
            System.out.println("Invalid Input...!!");
        }
        else if(num==1)
        {
            System.out.println(0);
        }
        else if(num==2){
            System.out.println(1);
        }
        else{
            System.out.print(0 + " ");
            System.out.print(1 +" ");
            for(int i=3;i<=num;i++)
            {
                third=first+second;
                System.out.print(third +" ");
                first=second;
                second=third;
            }
        }
    }
}
