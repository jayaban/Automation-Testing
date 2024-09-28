package Day10;

public class ThisKeyword {
	
	int x;
	int y;
//	 public ThisKeyword(int x, int y) {
//	x=x; //output will be 0 as there is confusion which is local var if const and which is instance var
//	y=y;
//	 }
	 public ThisKeyword(int x, int y) {
		this.	x=x; //using this keuword to distinguish
		this.	y=y;
			 }
	 public void display()
	 {
	
		 System.out.println(x);
		 System.out.println(y);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisKeyword tk = new ThisKeyword(200,300);

tk.display();
	}

}
