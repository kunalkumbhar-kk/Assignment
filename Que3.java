//Create a class which contains 2 instance variable a, b. write instance methods for finging the sum and difference of 2 variables.
public class Que3 
{
    // Instance variables
    private double a;
    private double b;

    // Constructor
    public Que3(double a, double b) 
    {
        this.a = a;
        this.b = b;
    }

    // Instance method to calculate and print the sum
    public void printSum() 
    {
        double sum = a + b;
        System.out.println("Sum: " + sum);
    }

    // Instance method to calculate and print the difference
    public void printDifference() 
    {
        double difference = a - b;
        System.out.println("Difference: " + difference);
    }

    public static void main(String[] args) 
    {
        // Create an instance of the Que3 class
        Que3 que3 = new Que3(10.0, 5.0);

        // Calculate and print the sum
        que3.printSum();

        // Calculate and print the difference
        que3.printDifference();
    }
}

/*
Output :
Sum: 15.0
Difference: 5.0
*/
