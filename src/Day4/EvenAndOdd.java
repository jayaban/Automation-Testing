package Day4;

public class EvenAndOdd {
	public static void main(String...args)
	{
		int i=1;
		while(i<=20)
		{
			if(i%2==0)
			{
				System.out.println("Even number is"+i);
				i++;
			}else
				System.out.println("Odd number is"+i);
			i++;
		}
	}

}
