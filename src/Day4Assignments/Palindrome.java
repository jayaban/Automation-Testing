package Day4Assignments;

import java.util.Scanner;

public class Palindrome {
public static void main(String args[])
{
	System.out.println("Enter a number");
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt(),reverse=0, number=i;
	while(i!=0)
	{
		int remainder = i%10;
		reverse = reverse*10+remainder;
		i=i/10;
	}
System.out.println(reverse);
if(reverse==number)
	{
	System.out.print("it is a palindrome number");
	}
else
	System.out.println("Not a palindrome");

}
}
