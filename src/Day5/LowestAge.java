package Day5;

public class LowestAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ages[]= {20,25,18,21,35};
		int lowestage = ages[0];
		
		for(int age : ages)
		{
			if (lowestage>age) {
			lowestage=age;
		}
		}
		System.out.println(lowestage);

	}

}
