package java.oop;
public class Main {
	public static void main(String[] args) {
		Cat cat=new Cat("Tom");
		Dog dog=new Dog("Kiwawa");
		Zoo zoo=new Zoo();
		zoo.add(cat);
		zoo.add(dog);
		zoo.showListAnimal();
	}
}
