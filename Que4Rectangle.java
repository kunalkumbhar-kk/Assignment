//write a program to print the area of a rectangle by creating a class named "rectangle" having two methods. Constructor takes length and breadth of rectangle as parameters and the second method named as "getArea" returns the area of the rectangle.
class Que4Rectangle 
{
    private double length;    // Private variable to store the length of the rectangle
    private double breadth;   // Private variable to store the breadth of the rectangle

    // Constructor to initialize the length and breadth of the rectangle
    public Que4Rectangle(double length, double breadth) 
    {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public double getArea() 
    {
        return length * breadth;
    }

    public static void main(String[] args) 
    {
        // Create an instance 'myRectangle' of the Que4Rectangle class with length 5.0 and breadth 3.0
        Que4Rectangle myRectangle = new Que4Rectangle(5.0, 3.0);

        // Display the area of the rectangle using the 'getArea' method
        System.out.println("The area of the rectangle is: " + myRectangle.getArea());
    }
}


// Output : The area of the rectangle is: 15.0

