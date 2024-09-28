package Day10;

public class Dog extends AbstractionDemo {
	void  animalSound() {
			System.out.println("Woof! Woof!"); //defined the abstract method in subclass
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog();
		myDog.sleep();
		myDog.animalSound();
	}

}
