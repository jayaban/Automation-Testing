package Day12;

import java.util.Scanner;


class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Program is started");

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();

try{System.out.println(100/a);}   // if a = 0 , then Arithmatic exception is thrown
catch(ArithmeticException e)
{
	System.out.println(e.getMessage());
	System.out.println("value of a is not correct");}
System.out.println("Program is completed");


//int arr[] = new int [5];
//System.out.println("Enter the position 0-4");
//int pos = sc.nextInt();
//System.out.println("Enter the value:"); // When given position  number 5 , then ArrayIndexOutofBound exception is thrown
//
//int value = sc.nextInt();
//arr[pos] = value;


String str = "1234";
int val = Integer.parseInt("1234"); //number format exception when non string value is passed
//
//String str= null;
//System.out.println(str.length()); //null pointer exception
System.out.println("Program is completed");

	}

}
