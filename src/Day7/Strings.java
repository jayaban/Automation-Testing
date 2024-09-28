package Day7;
import java.util.*;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome Home"; //declaration
		
	String s = "Jaya";
		System.out.println(str);  
		
		//finding length of string---length()
		System.out.println(str.length());
		// combining two strings---concat() or +
		
		System.out.println(str+" "+s);
		
		System.out.println(s+" ".concat(str));
		
		//removing whitespace from left and right ends---trim()
		
		String trim_s = " Uncodemy ";
		String trimmed = trim_s.trim();
		System.out.println(trim_s.trim());
		
		System.out.println(trim_s.length());
		
		System.out.println(trimmed.length());
		
		//to validate if pair of characters exists in a string---CONTAINS() returns boolean value
		
		System.out.println(trim_s.contains("cod"));
		System.out.println(trim_s.contains(" "));
		
		//to comapre two strings---- equals() and equalsIgnoreCase is used returns boolean value
		String val1 = "Hello";
		String val2 = "hello";
		
		System.out.println(val1.equals(val2));   //false
		System.out.println(val1.equalsIgnoreCase(val2));  //true
		
		//to replace single/multiple character in a string--- replace()
		
		String val = "Hello Selenium Java pythonk";
		System.out.println(val.replace("pythonk", "python"));  
		
		//to print part of the string---substring() is used
		
		System.out.println(val.substring(0,7));  
		
		//convert string to uppercase and lowercase ---toUpperCase() and toLowerCase()
		System.out.println(val.toUpperCase());  
		System.out.println(val.toLowerCase());  
		 
		//split the string based on a delimiter and then storing it into array then print the array---split()
		
		String split_s= "Jaya@gmail.com";
		String arr[] = split_s.split("@");
		System.out.println(arr[0]);  
		System.out.println(arr[1]);  
		System.out.println(Arrays.toString(arr));  
		
		
		

	}

}
