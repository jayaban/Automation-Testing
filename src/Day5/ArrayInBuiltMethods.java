package Day5;
import java.util.*;
public class ArrayInBuiltMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {500,200,3800,900,400,150,600};
		for(int str:arr)
		{
			System.out.println(str);
		
		}
		System.out.println();
		Arrays.sort(arr);
		for(int stri:arr)
		{
			System.out.println(stri);
		
		}
		Arrays.fill(arr, 569);
		for(int b:arr)
		{
			System.out.print(b+" ");
		
		}
		
		System.out.print(Arrays.toString(arr));
		
		int brr[] = {569, 100,200,300,400};
		System.out.print(Arrays.equals(arr,brr));

	}

}
