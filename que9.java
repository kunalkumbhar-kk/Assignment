//Print odd numbers from 1 to 10 using for, while, do-while.
public class que9
{
	public static void main(String[] args) {

		System.out.println("Even no using for loop");
		for (int i = 1; i <= 10; i++) 
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}

		System.out.println("Even no using while loop");
		int i = 1;
		while (i <= 10) 
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
			i++;	
		}

		System.out.println("Even no using do_while loop");
		i=1;
		do
		{
			if(i%2==1)
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
1
3
5
7
9
Even no using while loop
1
3
5
7
9
Even no using do_while loop
1
3
5
7
9
*/