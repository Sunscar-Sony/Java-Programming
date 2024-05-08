package Recursion;
public class Subsequence{
    public static void main(String[] args){

    }
}











// import java.util.Scanner;
// public class Subsequence{
//     static int count=0;
//     public static void subsequence(String str,int index, String ans){
//         //Base case
//         if(index==str.length()){
//             System.out.println(ans);
//             count+=1;
//             return;
//         }
//         char curr=str.charAt(index);
//         //choose
//         subsequence(str, index+1, ans+curr);
//         //Not Choose
//         subsequence(str, index+1, ans);
//     }

//     public static void main(String[] args){
//         Scanner input=new Scanner(System.in);
//         System.out.println("Enter the String:");
//         String str=input.nextLine();
//         //Function calling
//         System.out.println("Result:");
//         subsequence(str, 0, "");
//         System.out.println("Total no of possible Combinations is "+count);
//     }
// }