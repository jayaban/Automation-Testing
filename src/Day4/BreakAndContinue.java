package Day4;

public class BreakAndContinue {
public static void main(String...args)
{
	int i;
//	for(i =1;i<=10;i++)
//	{
//		if(i==5)
//		{
//			System.out.println(i);
//			break;    //when i becomes 5 then the for loop will break
//		}
//		System.out.println(i);
//	}
	
	for(i =1;i<=10;i++)
	{
		if(i%2==0)
		{
			//System.out.println(i);
			continue;    //execution for i is even number stops and it will jump to next
		}
		System.out.println(i);
	}


}
}
