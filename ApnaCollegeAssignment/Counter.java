import java.util.Scanner;

public class Counter
{
    static int positiveCount=0;
    static int negativeCount=0;
    static int zeroCount=0;

    public static void Checker(int num)
    {
        if(num==0){
            zeroCount+=1;
        }
        else if(num>0){
            positiveCount+=1;
        }
        else{
            negativeCount+=1;
        }
        return;
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number you want to give as the Input :");
        int testCase=input.nextInt();
        for(int i=1;i<=testCase;i++)
        {
            int num=input.nextInt();
            Checker(num);
        }
        System.out.println("No. of Positive Numbers :"+ positiveCount);
        System.out.println("No. of Negative Numbers :"+ negativeCount);
        System.out.println("No. of Zeros :"+ zeroCount);
    }
}
