import java.util.Scanner;
public class StringCompare
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the First Srting :");
        String str1=input.next();
        System.out.println("Enter the Second String :");
        String str2=input.next();
        if(str1.equals(str2))
        {
            System.out.println("Strings are Equal");
        }
        else
        {
            System.out.println("Strings are not Equal");
        }
        //Another way to do that using compareTo() method.
        if(str1.compareTo(str2)==0){
            System.out.println("Equal");
        }
        else if(str1.compareTo(str2)>0){
            System.out.println("String 1 is greater than String 2...");
        }
        else{
            System.out.println("String 2 is Greater than String 1");
        }
    }
}