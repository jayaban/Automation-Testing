package Arrays;

public class ArrayAsMethodParameter {
	
	static void met(int[] arr)
	{
		int min = arr[0];
		for(int i =0; i<arr.length;i++) {
			if (min>arr[i]) 
				min = arr[i];
			
		}
		
		System.out.println("min value "+" "+min);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {60,12,89,1,55,101};
met(a);
	}

}
