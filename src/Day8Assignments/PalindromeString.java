package Day8Assignments;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
System.out.println("enter a string:");

StringBuffer s = new StringBuffer(sc.next());
StringBuffer s1 = s.reverse();
if(s.equals(s1))
	System.out.println("it is palindrome");
else
	System.out.println("not a palindrome");


	}

}
