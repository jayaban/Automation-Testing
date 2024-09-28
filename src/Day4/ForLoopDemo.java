package Day4;

public class ForLoopDemo {
	public static void main(String args[])
	{
		int i;
		//print even number
//		for(i=0;i<=30;i+=2)
//		{
//			System.out.println("even number"+i);
//		}
		
		//print 30....0 odd and even numbers
		for(i=30;i>=0;i--)
		{
			if(i%2==0)
			{
				System.out.println("even number"+i);
			}else
				System.out.println("odd number"+i);
			
		}
		
	}

}
