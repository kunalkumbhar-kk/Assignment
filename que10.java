//Find area and circumference of a circle, given its radius.  Do this once without using methods and once using static methods for area & circumference.
import java.util.Scanner;

public class que10 
{
	private static final double pi = 3.14159;
    
        public static double calculateArea(double radius) 
        {
        	System.out.println();
        	System.out.println("****************  using static methods for area & circumference  ****************");
        	return pi * radius * radius;
    	}

    	public static double calculateCircumference(double radius) 
    	{
        	return 2 * pi * radius;
        }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        System.out.println();
    	System.out.println("****************  without using methods  ****************");
        double area = pi * radius * radius;
        double circumference = 2 * pi * radius;

        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);

        double Area = calculateArea(radius);
        double Circumference = calculateCircumference(radius);

        System.out.println("Area of the circle from static method : " + Area);
        System.out.println("Circumference of the circle from static method : " + Circumference);
        
    }
}

/*

Enter the radius of the circle: 5

****************  without using methods  ****************
Area of the circle: 78.53975
Circumference of the circle: 31.4159

****************  using static methods for area & circumference  ****************
Area of the circle from static method : 78.53975
Circumference of the circle from static method : 31.4159

*/