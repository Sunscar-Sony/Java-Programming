import java.util.Scanner;

public class Circle
{
    public static double circleCircumference(int radius)
    {
        double circumference=(double)((22/7)*2*radius);
        return circumference;
    }

    public static double Area(int radius)
    {
        double area=(double)(22/7)*radius*radius;
        return area;
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Radius of the Circle :");
        int radius=input.nextInt();
        double circleArea=Area(radius);
        System.out.println("Area :"+circleArea);
        double circlePerimeter=circleCircumference(radius);
        System.out.println("Circumference :"+circlePerimeter);
    }
}