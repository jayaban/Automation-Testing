package Day5;

public class AverageAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ages[]= {20,25,18,21,35};
float avg, sum=0;
int arlen = ages.length;
System.out.println("Length of array"+arlen);

for(int i:ages)
{
	sum=sum+i;
}
System.out.println("sum of ages array"+sum);
//average is 
avg = sum/arlen;
System.out.println("Average of all the ages is "+avg);
	}

}
