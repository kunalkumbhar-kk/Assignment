// Store 5 integers in an array and print in reverse order. 

public class que14 
{
    public static void main(String[] args) 
    {
        int[] numbers = new int[5];

        // Store 5 integers in the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Print the array in reverse order
        System.out.println("Array in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) 
        {
            System.out.println(numbers[i]);
        }
    }
}

/*
Output:
Array in reverse order:
50
40
30
20
10
*/