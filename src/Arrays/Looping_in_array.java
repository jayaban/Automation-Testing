package Arrays;

public class Looping_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {10,20,30,40,50,60};
//a= new int[6];

for(int i=0; i<a.length;i++) {
	
	System.out.println("array values are"+" "+a[i]);
}

for(int j=a.length-1;j>=0;j--) {
	
	System.out.println("reverse array value"+" "+a[j]);
}
	
	}

	}
