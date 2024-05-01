import java.util.Scanner;
public class Search
{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int size=input.nextInt();
        int [] userArray = new int[size];
        System.out.println("Enter the Elements of the Array :");
        for(int i=0;i<size;i++){
            userArray[i]=input.nextInt();
        }
        System.out.println("Enter the Data you want to search");
        int searchItem=input.nextInt();
        int count=size+1;
        for(int i=0;i<size;i++){
            if(userArray[i]==searchItem){
                count=i;
                break;
            }
        }
        if(count<size){
            System.out.println("Data Found...");
            System.out.println("Index :"+ count);
        }
        else{
            System.out.println("Data Not Found !");
        }
    }
}