package Day10;

public class ConstructorDemo {
	int x;
	int y; //declared attributes/variables
	public  ConstructorDemo()
	{
		x=5;
		y=6;   //initialized attibutes
	
	}
	public ConstructorDemo(int a, int b)
	{
		x=x+a;
		y=y+b;   //parameterized constructor
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstructorDemo cd = new ConstructorDemo(); //called simple const
System.out.println(cd.x);
cd.y=7; //overriden value of y for cd obj
System.out.println(cd.y);
ConstructorDemo cd1 = new ConstructorDemo(200,300);

System.out.println(cd1.x);
System.out.println(cd1.y);
	}

}
