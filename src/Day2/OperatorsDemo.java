package Day2;

public class OperatorsDemo {
	public static void main (String args[]) {
		//aritnmatic operators
		int a=10, b= 20;
		
		System.out.println("Sum of ab "+(a+b));
		System.out.println("diff of ab "+(a-b));
		System.out.println("multiplication of ab "+(a*b));
		System.out.println("division of ab "+(a/b));
		System.out.println("mod of ab "+(a%b));
		
		//relational opeartors, return boolean values true or false
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		boolean res = a==b;
		System.out.println(res);
		
		//logical operators, return boolean values
		boolean x= true;
		boolean y =false;
		System.out.println(x&&y); //* false
		System.out.println(x||y);//+ true
		System.out.println(!x); //false
		System.out.println(!y);//true
		
		boolean x1 = a>b;//false
		boolean x2 = a<b;//true
		
		System.out.println((x1)&&(x2));
		
		//increment and decrement operators
		System.out.println(a);//10
		//a++;
		System.out.println(a++);
		
		int ra = a++; //post incrementation assigning value first then performing operation
		System.out.println(ra);//10
		System.out.println(a);//11
		
		
		System.out.println(b); //20
		int rb = ++b; //21// pre increment
		System.out.println(rb);
		
		
		//Assignment opeartors =, +=,-=,*=,/=
		int r =30;
		
		r += 5;
		r -= 5;
		System.out.println(r);//30
		
		r *= 3;
		System.out.println(r);//90
		
		r /=5; 
		System.out.println(r);//18
		
		r %= 5;
		System.out.println(r);//0
		
		//ternary operator, var = exp? result 1 :result 2
		int s= 100,t =200;
		int u = s>t? s:t;
		System.out.println(u);
		
		int age =15;
		boolean booll = age>=18? true : false;
		System.out.println(booll);
		
		
		
		
		
		
		
	}

}
