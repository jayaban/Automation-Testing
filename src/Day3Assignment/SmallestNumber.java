package Day3Assignment;

import java.util.Scanner;

public class SmallestNumber {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter value of a"+"=");
	int a = sc.nextInt();
	System.out.println("enter value of b"+"=");
	int b = sc.nextInt();
	System.out.println("enter value of c"+"=");
	int c = sc.nextInt();
//	if (a>b && a>c) {
//		System.out.println("a is largest"+a);
//	}else if(b>a && b>c) {
//		System.out.println("b is largest"+b);
//	}else {
//		System.out.println("c is largest"+c);
//	}
	
	
	int d = (a<b && a<c)? a:b;
	//System.out.println("smallest"+d);
	int e = (b<a && b<c)? b:c;
	//System.out.println("smallest"+e);
	int f = d<e? d:e;
	System.out.println("smallest"+f);
}

}
