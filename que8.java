//Print even numbers from 1 to 10 using for, while, do-while.

public class que8
{
	public static void main(String[] args) {

		System.out.println("Even no using for loop");
		for (int i = 1; i <= 10; i++) 
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}

		System.out.println("Even no using while loop");
		int i = 1;
		while (i <= 10) 
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;	
		}

		System.out.println("Even no using do_while loop");
		i=1;
		do
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
		while(i <= 10);
	}
}

/*
Even no using for loop
2
4
6
8
10
Even no using while loop
2
4
6
8
10
Even no using do_while loop
2
4
6
8
10
*/