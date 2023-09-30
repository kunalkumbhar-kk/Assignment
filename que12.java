//Check if the given character is a vowel or consonant without using methods.  Do the same program by passing the char to a static method and returning the result.
import java.util.Scanner;
public class que12
{
    public static void main(String[] args) 
    {
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        ch = scanner.next().charAt(0);

        System.out.println();
        System.out.println("****************  without using methods  ****************");
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
        {
            // Check if the character is a letter
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            {
                System.out.println(ch + " is a vowel.");
            } 
            else 
            {
                System.out.println(ch + " is a consonant.");
            }
        } 
        else 
        {
            System.out.println(ch + " is not a letter.");
        }

        System.out.println();
        System.out.println("****************  using static methods for area & circumference  ****************");
        if (isLetter(ch)) 
        {
            if (isVowel(ch)) 
            {
                System.out.println(ch + " is a vowel.");
            } 
            else 
            {
                System.out.println(ch + " is a consonant.");
            }
        } 
        else 
        {
            System.out.println(ch + " is not a letter.");
        }
    }

    public static boolean isLetter(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    public static boolean isVowel(char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
               ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

/* 
Output:

E:\Anudip\Assignment>java que12
Enter a character: d

****************  without using methods  ****************
d is a consonant.

****************  using static methods for area & circumference  ****************
d is a consonant.

E:\Anudip\Assignment>java que12
Enter a character: e

****************  without using methods  ****************
e is a vowel.

****************  using static methods for area & circumference  ****************
e is a vowel.

E:\Anudip\Assignment>java que12
Enter a character: 6

****************  without using methods  ****************
6 is not a letter.

****************  using static methods for area & circumference  ****************
6 is not a letter.
    
*/