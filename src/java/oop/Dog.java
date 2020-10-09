package java.oop;
public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}

	@Override
	public void sayHello() {
		System.out.println("Hi, I'm " + super.getName());
	}

}
