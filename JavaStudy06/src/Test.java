class A{
	void print() {
		System.out.println("A class");
	}
}

class B extends A{
	void print() {
		System.out.println("B class");
	}
}

public class Test {
	public static void main(String[] args) {
		A aa = new A();
		aa.print(); // A class
		
		B bb = new B();
		bb.print(); // B class
		
		A ab = new B();
		ab.print(); // B class
	}
}
