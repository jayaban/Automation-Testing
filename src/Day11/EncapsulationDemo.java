package Day11;

public class EncapsulationDemo {
	private int accno;
	private String name;
	private double amount;
	
	void setaccno(int accno) //using set method to set the value of the attributes and later this method will be called by another class
	{
		this.accno=accno;
		
	}
	int getaccno()
	{
		return accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	


}
