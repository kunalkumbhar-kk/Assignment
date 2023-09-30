//Print "PASS" if the int variable "mark" is more than or equal to 50; or prints "FAIL" otherwise.

import java.io.*;
import java.util.*;

public class que6
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int mark;

		System.out.println("Eneter marks :");
		mark = scan.nextInt();

		
		if (mark >= 50)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
}

/* 
Eneter marks :
50
PASS

Eneter marks :
49
FAIL 
*/