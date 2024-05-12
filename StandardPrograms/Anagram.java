import java.util.Scanner;

public class Anagram{
    static int[] map=new int[26];
    public static void checkAnagram(String str1, String str2){
        //First Marking the postiton with 1.
        if(str1.length()==str2.length()){
            //Mapping first string
            for(int i=0;i<str1.length();i++){
                char current=str1.charAt(i);
                map[current-'a']=1;
            }
            for(int i=0;i<str2.length();i++){
                char current=str2.charAt(i);
                map[current-'a']=0;
            }
            //checking the map array if it is all 0 then the strings are anagram
            int checker=0;
            for(int i=0;i<26;i++){
                if(map[i]!=0){
                    checker=1;
                    break;
                }
            }
            if(checker==0){
                System.out.println("Both Strings are Anagrams");
            }else{
                System.out.println("Not Anagrams");
            }
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the First String");
        String str1=input.next();
        System.out.println("Enter the Second String:");
        String str2=input.next();
        checkAnagram(str1, str2);
    }
}
