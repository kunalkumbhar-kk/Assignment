//Write a program to demonstrate static variable.
class Que6 
{
    static int staticVariable = 0; // Static variable shared among all instances

    void show() 
    {
        // Display the current value of staticVariable
        System.out.println("Value of staticVariable = " + staticVariable);

        // Increment staticVariable
        staticVariable = staticVariable + 1;
    }

    public static void main(String[] args) {
        // Create an instance 'a' of the Que6 class
        Que6 a = new Que6();

        // Call the 'show' method on instance 'a'
        a.show();

        // Create another instance 'b' of the Que6 class
        Que6 b = new Que6();

        // Call the 'show' method on instance 'b'
        b.show();

        // Create a third instance 'c' of the Que6 class
        Que6 c = new Que6();

        // Call the 'show' method on instance 'c'
        c.show();
    }
}

/*
Output :
No = 0
No = 1
No = 2
*/