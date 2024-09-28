package Day8;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String str = "Jaya";
//String rev ="";
//approac 1 using string function
//for(int i = str.length()-1;i>=0;i--)
//{
//	rev= rev+str.charAt(i);
//
//}
//System.out.println("reverse string :"+rev);
//	}

//approach 2 using array function

//char arr[] = str.toCharArray();
//for(int i=arr.length-1;i>=0;i--)
//{
//	rev = rev + arr[i];
//
//}System.out.println(rev);  
//}

//approach 3 using string buffer
StringBuffer s = new StringBuffer("Banerjee");
System.out.println(s.reverse());  

//approach 4 using string builder
StringBuilder sa = new StringBuilder("Jaya");
System.out.println(sa.reverse());  
	}}
	
	


