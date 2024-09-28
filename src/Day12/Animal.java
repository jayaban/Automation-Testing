package Day12;

public class Animal {
	
	int a = 10;
	void method()
	{
		System.out.println("this is animal method");
	}
	

}
class Lion extends Animal
{
	int a = 20;
	void abc()
	{
		System.out.println(super.a);
		super.method();
	}
	void method()
	{
		System.out.println("this is Lion method");
	}
}

