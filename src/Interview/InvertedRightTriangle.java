package Interview;

public class InvertedRightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rows=5;
for(int i=rows-1;i>=0;i--) {
	for(int j=0;j<=i;j++) {
		System.out.print("*");
	}
	System.out.println(" ");
}
	}

}
