package Assignment1;

public class Swap {
public static void main (String []args) {
	int a = 10, b= 20, c; //using thirs variable or swapping
	//before swapping
	System.out.println("current value of a"+" "+a);
	System.out.println("current value of b"+" "+b);
	//swapping process using third container
	c=b;
	b=a;
	a=c;
	//after swapping
	

	System.out.println("new value of a"+" "+a);
	System.out.println("new value of b"+" "+b);
}
}
