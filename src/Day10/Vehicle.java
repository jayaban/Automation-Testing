package Day10;

public class Vehicle implements MultipleInheritance, SecondInterface {
	@Override
	public void carModel() {
		// TODO Auto-generated method stub
		System.out.println("Benz eclass");
	}

	@Override
	public void carBrand() {
		// TODO Auto-generated method stub
		System.out.print("Mercedes");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vh = new Vehicle();
		vh.carBrand();
		vh.carModel();
		System.out.println(vh.makeYear);
	}

}
