//Initialize 2 variables and find the sum, difference, product, quotient and remainder.  Do it using static methods and without static methods.
import java.util.Scanner;

public class que13 
{
	public static void arithmeticOperations(double a, double b) 
    {
    	System.out.println();
        System.out.println("****************  using static methods for area & circumference  ****************");
        // Sum
        double sum = a + b;
        System.out.println("Sum: " + sum);

        // Difference
        double difference = a - b;
        System.out.println("Difference: " + difference);

        // Product
        double product = a * b;
        System.out.println("Product: " + product);

        // Quotient and Remainder
        double quotient = a / b;
        System.out.println("Quotient: " + quotient);

        double remainder = a % b;
        System.out.println("Remainder: " + remainder);
    } 

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println();
        System.out.println("****************  without using methods  ****************");
        // Sum
        double sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Difference
        double difference = num1 - num2;
        System.out.println("Difference: " + difference);

        // Product
        double product = num1 * num2;
        System.out.println("Product: " + product);

        // Quotient and Remainder
        double quotient = num1 / num2;
        System.out.println("Quotient: " + quotient);

        double remainder = num1 % num2;
        System.out.println("Remainder: " + remainder);

        arithmeticOperations(num1, num2);
    }
}

/*
Output :
Enter the first number: 4
Enter the second number: 2

****************  without using methods  ****************
Sum: 6.0
Difference: 2.0
Product: 8.0
Quotient: 2.0
Remainder: 0.0

****************  using static methods for area & circumference  ****************
Sum: 6.0
Difference: 2.0
Product: 8.0
Quotient: 2.0
Remainder: 0.0

