class A{
	void abc() {
		System.out.println("A");
	}
}
class B extends A{
	void abc() {
		System.out.println("B");
	}
}
class C extends B{
	void abc() {
		System.out.println("C");
	}
}
class D extends C{
	void abc() {
		System.out.println("D");
	}
}
public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
		A a1 = new B();
		a1.abc();
		A a2 = new C();
		a2.abc();
		A a3 = new D();
		a3.abc();
		B b = new B();
		b.abc();
		B b2 = new C();
		b2.abc();
		
	}
}
