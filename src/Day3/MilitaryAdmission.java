package Day3;

public class MilitaryAdmission {
	public static void main(String args[]) {
		
		
		int age = 15;
		float weight = 62.8f;
		float height = 5.7f;
//			if ( age>= 18 && weight>=60 && height>= 5.5)
//		{
//			System.out.println("eligible for admission"); ///if all the conditions are true
//		}else if (age<18)
//		{
//			System.out.println("not eligible for admission due to age");
//		}else if (weight<60)
//		{
//			System.out.println("not eligible for admission due to weight");
//		}else
//		{
//			System.out.println("not eligible for admission due to height");
	//	}
			if(age>=18)
			{
				if(weight>=60)
				{
					if(height<=5.5)
					{
						System.out.println("Eligible admisiion");
					}
					else {
						
						System.out.println("not eligible for admission due to height");
						}}
					else{System.out.println("not eligible for admission due to weight");}}
					else {System.out.println("not eligible for admission due to height");}}
	
	}

	
				
	
			
	
	


