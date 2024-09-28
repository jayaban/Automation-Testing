package Day5;

public class SingleDimensionarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //array declaration and adding values
		//way1
		int arr[]= new int[5];
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
		arr[4]=500;
		//way2
		int a[]= {1000,2000,3000,4000,5000,6000,7000};
		
		//reading single value from the array
		
		System.out.println(arr[3]); //400
		System.out.println(a[5]); ///6000
		 // reading multiple values form array
		for(int i=0; i<=a.length-1;i++)
		{
			System.out.println(a[i]+" ");
		}
		// reading multiple values form array using for each loop
		for(int str:arr)
		{
			
			System.out.println(str+" ");
		}
		
		
		
		
		}

}
