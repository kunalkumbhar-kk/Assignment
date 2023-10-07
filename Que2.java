// create a class which contains static methods for finding the sum and difference of two numbers.

public class Que2 
{
    // Static method to calculate and display the sum and difference of two numbers
    public static void mathOperation(int num1, int num2) 
    {
        // Calculate the sum of num1 and num2
        int sum = num1 + num2;
        // Calculate the difference of num1 and num2
        int difference = num1 - num2;
       
        // Display the sum
        System.out.println("Sum: " + sum);
        // Display the difference
        System.out.println("Difference: " + difference);
    }

    public static void main(String[] args) 
    {
        // Define two integer variables
        int num1 = 10;
        int num2 = 5;

        // Call the static mathOperation method to calculate and display both sum and difference
        Que2.mathOperation(num1, num2);
    }
}


/*
Output :
Sum: 15
Difference: 5
*/