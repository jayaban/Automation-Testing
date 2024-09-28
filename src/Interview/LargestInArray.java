package Interview;

public class LargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {20,8,90,71,4,52};
int maxnum= arr[0];
for(int i =0; i<=arr.length-1;i++) {
	if(maxnum<arr[i]) {
		System.out.println("Max number is : "+arr[i]);
		break;
	}
	
}
	}

}
