package java.oop;
public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void sayHello() {
		System.out.println("Hi, I'm " + super.getName());
	}

}
