class Animal{
	void cry() {
	}
}

class Bird extends Animal{
	void cry() {
		System.out.println("쨱쨱");
	}
}
class Cat extends Animal{
	void cry() {
		System.out.println("냐옹");
	}
}
class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
}
public class Test {
	public static void main(String[] args) {
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		
		Animal ab = new Bird();
		Animal ac = new Cat();
		Animal ad = new Dog();
		
		aa.cry(); // x
		bb.cry(); // 짹쨱
		cc.cry(); // 냐옹
		dd.cry(); // 멍멍
		
		ab.cry(); // 쨱쨱
		ac.cry(); // 냐옹
		ad.cry(); // 멍멍
	}
}



