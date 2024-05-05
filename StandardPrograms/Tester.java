import java.util.Scanner;
public class Tester{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int temp=num;
        int newNum=0;
        while(temp>0){
            int lastDigit=temp%10;
            newNum=newNum*10 + lastDigit;
            temp/=10;
        }
        if(newNum==num){
            System.out.println(num+" is a palindrome");
        }else{
            System.out.println(num+" is not a palindrome");
        }
    }
}