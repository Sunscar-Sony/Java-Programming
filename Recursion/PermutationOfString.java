package Recursion;
import java.util.Scanner;
public class PermutationOfString{
    static int count=0;
    public static void printpermutation(String str, String permutation){
        //Base Case
        if(str.length()==0){
            System.out.println(permutation);
            count+=1;
            return;
        }
        //My task to do
        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            printpermutation(newStr, permutation+current);
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=input.nextLine();
        System.out.println("Total Possible Permutations are:");
        printpermutation(str, "");
        System.out.println("Total Count :"+"\n"+count);
    }
}