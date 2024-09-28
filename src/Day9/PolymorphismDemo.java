package Day9;

public class PolymorphismDemo {
	 int x=100, y=200;
	 void sum()
	 {
		 System.out.println(x+y);
	 }
void sum(int a, int b)
{
System.out.println(a+b);	
}
void sum(int a, double b)
{
System.out.println(a+b);	
}
void sum(double a, int b)
{
System.out.println(a+b);	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
PolymorphismDemo pd = new PolymorphismDemo();
pd.sum();
pd.sum(10,20);
pd.sum(11,12.5);
pd.sum(11.5,12);
	}

}
