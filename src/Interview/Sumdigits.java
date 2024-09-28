package Interview;

import java.util.Scanner;

public class Sumdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int sum= 0;

System.out.print("Enter a number");
int num = sc.nextInt();

while(num!=0)
{
int	rem=num%10;
sum+= rem;
num/=10;


}
System.out.print("sum of values"+" "+sum);
	}

}
