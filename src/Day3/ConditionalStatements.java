package Day3;

public class ConditionalStatements {
	public static void main(String...args) {
		int personage = 18;
		if(personage>18) {
			System.out.println("driving eligible above 18 not including 18");
		}
//		if(personage>=18) {
//			System.out.println("driving eligible");
//		}
		else
			System.out.println("ineleigible");
		
		int n=9;
		if(n>0)        //if..elseif
		{
			System.out.println("positive number");
		}
		else if (n<0) {
			System.out.println("negative number");
		}
		else {
			System.out.println("number is 0");
		}
		
	}

}
