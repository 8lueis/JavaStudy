abstract class Animal{
	abstract void cry();
}
class Cat extends Animal{
	void cry() {
		System.out.println("야용");
	}
}
public class Test {
	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.cry();
	}
}
