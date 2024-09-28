package Day4Assignments;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt(),count=0;
		while(i!=0)
		{
			i/=10;
			++count;
			
		}
		if(i%2==0) {
			System.out.println("Even number are"+count);
		}else
		  System.out.println("Odd numbers are"+count);

	}

}
