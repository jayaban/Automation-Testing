package Day10;

public interface InterfaceDemo {
public abstract void carModel();
public abstract void carBrand();
}

class Cars implements InterfaceDemo
{

	@Override
	public void carModel() {
		System.out.println("Innova");
	}

	@Override
	public void carBrand() {
System.out.println("Toyota");		
	}}

