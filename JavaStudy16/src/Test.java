class A{
	void abc() {
		System.out.println("A class abc()");
	}
}
class B extends A{
	void abc() {
		System.out.println("B class abc()");
	}
	void bcd() {
		super.abc();
	}
}
public class Test {
	public static void main(String[] args) {
		B b = new B();
		b.abc(); // B class abc()
		b.bcd(); // A class abc()
	}
}
