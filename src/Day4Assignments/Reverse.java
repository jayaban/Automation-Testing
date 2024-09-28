package Day4Assignments;

import java.util.Scanner;

public class Reverse {
public static void main(String args[]) {
	
	System.out.println("Enter a number");
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt(),reverse=0;
//	while(i!=0)
//	{
//		int remainder = i%10;
//		reverse = reverse*10+remainder;
//		i=i/10;
//	}
//	System.out.println(reverse);
	
	for(;i!=0;i=i/10)
	{
		int remainder=i%10;
		reverse = reverse*10+remainder;
	}
	System.out.println(reverse);
	
}
}
