package Day4Assignments;

import java.util.Scanner;

public class CountDigits {
	public static void main(String args[])
	{
		System.out.println("Enter a number");
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt(),count=0;
		
		while(i!=0)
		{
			i/=10;
			++count;
			
		}
		System.out.println(count);
		
		
	}

}
