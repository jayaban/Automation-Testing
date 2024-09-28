package Day11;

public class EncapsulationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	EncapsulationDemo ed = new EncapsulationDemo();
//		ed.accno=12345;
//		ed.name= "Jaya"; //error can t be acceesed using object as the attributes are privte 
//		ed.amount = 10000.0;
//		
ed.setaccno(12345);
System.out.println(ed.getaccno());

ed.setAmount(10000.12);
System.out.println(ed.getAmount());

ed.setName("Jaya");
System.out.println(ed.getName());

	}

}
