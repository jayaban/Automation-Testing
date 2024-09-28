package Day9;


class A
{
	int a =100;
	void display()
	{
		System.out.println("ClassA function");
		
	}

}
class B extends A
{
	int b = 200;
	void show()
	{
		System.out.println("ClassB function");
		
	}

}
class C extends B //multilevel inheritance
{
	int c = 300;
	void view()
	{
		System.out.println("ClassC function");

	}
}
public class InheritanceTypes {

public static void main(String args[])
{
	A obja= new A();
	B objB = new B();
	System.out.println(objB.a);// B class inherited every attriute of A class
	objB.display();
	objB.show();
	System.out.println(obja.a);
	obja.display();
	
}

}
