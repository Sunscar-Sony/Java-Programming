import java.util.*;
public class Strings
{
    public static void main(String[] args)
    {
        StringBuilder str=new StringBuilder("Sanskar");
        str.append("Soni");
        System.out.println(str);
        for(int i=0;i<str.length()/2;i++)
        {
            int front=i;
            int back=str.length()-1-i;

            char frontChar=str.charAt(front);
            char backChar=str.charAt(back);

            
        }
    }
}