import java.util.Scanner;
import java.lang.StringBuilder;

public class Duplicates{
    public static int[] map=new int[10];
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number :");
        StringBuilder str=new StringBuilder(input.next());
        StringBuilder result=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            if(map[current-'0']==0){
                result.append(current);
                map[current-'0']+=1;
            }
        }
        System.out.println("Result :"+"\n"+result);
    }
}

