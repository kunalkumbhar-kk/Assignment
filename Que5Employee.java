//Create a class called Employee, with an ID, name and salary. The method increaseSalary(percent) increases the salary by the given percentage.Write the Employee class.
public class Que5Employee 
{
    private int id;           // Private variable to store employee ID
    private String name;      // Private variable to store employee name
    private double salary;    // Private variable to store employee salary

    // Constructor to initialize employee details (ID, name, and salary)
    public Que5Employee(int id, String name, double salary) 
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to increase the employee's salary by a given percentage
    public void increaseSalary(double percent) 
    {
        double increaseAmount = (percent / 100) * salary;
        salary += increaseAmount;
        System.out.println("Salary increased by " + percent + "%");
    }

    // Method to display the employee's details
    public void getEmployeeDetails() 
    {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
    }

    public static void main(String[] args) 
    {
        // Create an Employee object with initial details
        Que5Employee employee = new Que5Employee(1, "John Doe", 50000.0);

        // Print the initial employee details using getEmployeeDetails
        System.out.println("Employee Details:");
        employee.getEmployeeDetails();

        // Increase the employee's salary by 10%
        employee.increaseSalary(10);

        // Print the updated employee details using getEmployeeDetails
        System.out.println("\nUpdated Employee Details:");
        employee.getEmployeeDetails();
    }
}




/*
Output :
Employee Details:
Employee ID: 1
Employee Name: John Doe
Employee Salary: $50000.0
Salary increased by 10.0%

Updated Employee Details:
Employee ID: 1
Employee Name: John Doe
Employee Salary: $55000.0
*/