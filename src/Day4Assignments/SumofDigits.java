package Day4Assignments;

import java.util.Scanner;

public class SumofDigits {
	public static void main(String[] args)
	{
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int i= sc.nextInt(), sum=0;
		while(i!=0) {
			int remainder= i%10;
			sum = sum+remainder;
			i=i/10;
		}
		System.out.println(sum);
		
	}
}
