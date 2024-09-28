package FactoryPattern;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CarFactory factory = new CarFactory();
Car sedancar = factory.getCar("SEDAN");
sedancar.assembly();
Car suvcar = factory.getCar("SUV");
suvcar.assembly();
Car minicar = factory.getCar("MINI");
minicar.assembly();
	}

}
