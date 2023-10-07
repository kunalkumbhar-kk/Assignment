//Demonstrate methods in String and StringBuilder classes.

public class Que8 
{
    public static void main(String[] args) 
    {
        // Demonstrating String methods
        String str = "Hello, World!";
        
        // Length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // Character at index
        char character = str.charAt(7);
        System.out.println("Character at index 7: " + character);
        
        // Substring
        String substring = str.substring(7, 12);
        System.out.println("Substring: " + substring);

        // Demonstrating StringBuilder methods
        StringBuilder sb = new StringBuilder("Hello");
        
        // Append
        sb.append(", World!");
        System.out.println("StringBuilder after append: " + sb.toString());
        
        // Insert
        sb.insert(5, " Good");
        System.out.println("StringBuilder after insert: " + sb.toString());
        
        // Delete
        sb.delete(6, 11);
        System.out.println("StringBuilder after delete: " + sb.toString());
        
        // Reverse
        sb.reverse();
        System.out.println("StringBuilder after reverse: " + sb.toString());
    }
}

/*
Output :
Length of the string: 13
Character at index 7: W
Substring: World
StringBuilder after append: Hello, World!
StringBuilder after insert: Hello Good, World!
StringBuilder after delete: Hello  World!
StringBuilder after reverse: !dlroW  olleH
*/