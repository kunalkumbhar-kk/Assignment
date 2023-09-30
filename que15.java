//Initialize an int array, char array and a string array with values.
public class que15 
{
    public static void main(String[] args) 
    {
        // Initialize an integer array
        int[] intArray = {1, 2, 3, 4, 5};

        // Initialize a character array
        char[] charArray = {'A', 'B', 'C', 'D', 'E'};

        // Initialize a string array
        String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};

        // Print the integer array
        System.out.print("Integer Array: ");
        for (int i = 0; i < intArray.length; i++) 
        {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        // Print the character array
        System.out.print("Character Array: ");
        for (int i = 0; i < charArray.length; i++) 
        {
            System.out.print(charArray[i] + " ");
        }
        System.out.println();

        // Print the string array
        System.out.print("String Array: ");
        for (int i = 0; i < stringArray.length; i++) 
        {
            System.out.print(stringArray[i] + " ");
        }
        System.out.println();
    }
}

/*
Output :
Integer Array: 1 2 3 4 5
Character Array: A B C D E
String Array: apple banana cherry date fig
*/