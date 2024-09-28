package Day10;

public class ConstructorOverloading {
	double l = 12.5, b = 10;
ConstructorOverloading() //constructor of ConstructorOverloading Class
{
	this.l=l;
	this.b=b;
	
}
ConstructorOverloading(int l) //constructor of ConstructorOverloading Class
{
	this.l=l;
	
}

public static void main(String args[]) {
	
	ConstructorOverloading co = new ConstructorOverloading();
System.out.println(co.l);
ConstructorOverloading co1 = new ConstructorOverloading(20);
System.out.println(co1.l);
}
}
