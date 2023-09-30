class A{
	void print() {
		System.out.println("A");
	}
}
class B extends A{
	void print() {
		System.out.println("B");
	}
}
class C extends B{
	void print() {
		System.out.println("C");
	}
}
class D extends C{
	void print() {
		System.out.println("D");
	}
}

public class Test {
public static void main(String[] args) {
	A a = new A();
	a.print();
	
	A ab = new B();
	ab.print();
	
	A ac = new C();
	ac.print();
	
	A ad = new D();
	ad.print();
	
	B bc = new C();
	bc.print();
}
}
