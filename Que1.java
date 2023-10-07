//Create a class named "employee" with string variable "name" and integer variable "id". Create two objects with id and name initialized and print these details.

// Define a class named Que1
public class Que1 
{
    // Declare instance variables for name and id
    String name;
    int id;

    // Method to set employee details
    public void employeeDetails(String name, int id)
    {
        // Use "this" keyword to distinguish between instance variables and method parameters
        this.name = name;
        this.id = id;
    }

    // Method to display employee details
    public void displayEmployeeDetails()
    {
        System.out.println("Employee Name :" + name);	
        System.out.println("Employee ID :" + id);
    }

    // Main method where the program execution begins
    public static void main(String[] args) 
    {
        // Create an object of the Que1 class to store employee name
        Que1 name = new Que1();
        
        // Create another object of the Que1 class to store employee ID
        Que1 id = new Que1();

        System.out.println("**********  Output from name object :  **********");
        // Set and display details for the 'name' object
        name.employeeDetails("ravi shastri", 1001);
        name.displayEmployeeDetails();

        System.out.println();
        System.out.println("**********  Output from id object :  **********");
        // Set and display details for the 'id' object
        id.employeeDetails("virat kohli", 1002);
        id.displayEmployeeDetails();
    }
}


/*
Output :
**********  Output from name object :  **********
Employee Name :ravi shastri
Employee ID :1001

**********  Output from id object :  **********
Employee Name :virat kohli
Employee ID :1002
*/

