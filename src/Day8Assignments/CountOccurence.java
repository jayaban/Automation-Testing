package Day8Assignments;

public class CountOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbaabccc";
		
		int count = 0;
		 char arr[]= s.toCharArray();
		 
		 for (int i=0; i<=arr.length-1;i++)
		 {
			 count++;
		 }
		 System.out.println(count);  
	}

}
