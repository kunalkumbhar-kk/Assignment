//Initialize 2 numbers and initialize 1 char variable for mathematical operator. Find the sum, difference, product and quotient and remainder depending on the mathematical operator value. (Use switch statement).

public class que7
{
	public static void main(String[] args) 
	{	
		int a = 5;
		int b = 25;
		char c = 'S';
		switch (c) 
		{
  			case 'S':
    		System.out.println("Sum :" + (a+b));
    		break;
  			case 'D':
    		System.out.println("Difference :" + (a-b));
    		break;
  			case 'P':
    		System.out.println("Product :" + (a*b));
    		break;
  			case 'q':
    		System.out.println("Quotient="+(a/b));
    		break;
  			case 'R':
    		System.out.println("Remainder=" + (a % b));
    		break;
		}
	}
}

// Output:
// Sum :30