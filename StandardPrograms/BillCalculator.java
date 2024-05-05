import java.util.Scanner;
public class BillCalculator{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        char foodType=input.next().charAt(0);
        int quantity=input.nextInt();
        int distance=input.nextInt();
        int bill;
        if(foodType == 'N' && distance>0 && quantity>0){
            if(distance<=3){
                bill=quantity*15;
            }else if(distance<=6){
                bill=quantity*15 + (distance-3)*1;
            }else{
                bill=quantity*15 + (distance-6)*2 +3;
            }
        }else if(foodType=='V' && distance>0 && quantity>0 ){
             if(distance<=3){
                bill=quantity*12;
            }else if(distance<=6){
                bill=quantity*12 + (distance-3)*1;
            }else{
                bill=quantity*12 + (distance-6)*2 +3;
            }
        }else{
            bill=-1;
        }
        System.out.println(bill);
    }
}