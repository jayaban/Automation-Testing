package Day12;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account ac = new Account();
//ac.accno = 12345;
//ac.name ="Jaya";
//ac.amount = 500000.1;
ac.setAccno(12345);
ac.setName("Jaya");
ac.setAmount(5243.5);
System.out.println(ac.getAccno());
System.out.println(ac.getAmount());
System.out.println(ac.getName());


	}

}
