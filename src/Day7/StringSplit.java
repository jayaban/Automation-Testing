package Day7;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String email = "Jaya@email.com";
String arr[]=email.split("@");
System.out.println(arr[0]);
System.out.println(arr[1]);
System.out.println(Arrays.toString(arr));


	}

}
