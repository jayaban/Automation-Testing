package Day5;

public class Doubledimensionarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][]= {{1000,2000,3000},{4000,5000,6000},{7000,8000,9000}};//size is b[3][3] b.length is 3 which is for rows
		
		//readig single value
		System.out.println(b[1][2]);
		
		//reading multiple values
//		for(int i=0;i<=b.length-1;i++)
//		{
//			for(int j=0;j<=b[2].length-1;j++)     //b[2].length will take 3rd column and count number of rows in it
//			{
//				
//				System.out.println(b[i][j]+" ");
//			}
//			
//		}
		
		//print in two dimension with line change
		for(int i=0;i<=b.length-1;i++)
		{
			for(int j=0;j<=b[2].length-1;j++)     //b[2].length will take 3rd column and count number of rows in it
			{
				
				System.out.print(b[i][j]+" ");
			}
			
			System.out.println();
		}
		
		//using for each loop
		for(int str[]:b)
		{
			for(int stri:str)
			{
				System.out.print(stri);
			}
			System.out.println();
		}
		
		
	}

}
