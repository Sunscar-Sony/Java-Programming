import java.util.Scanner;

public class Voter
{
    public static void voterCheck(int age)
    {
        if(age>=18)
        {
            System.out.println("Congratulations! You are Eligble to Vote...");
        }
        else
        {
            System.out.println("You are Not Eligble to Vote");
        }
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Age of the Candidate:");
        int age=input.nextInt();
        voterCheck(age);
    }
}
