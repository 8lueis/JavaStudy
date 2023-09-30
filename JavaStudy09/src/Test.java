class A{
	void abc() {
		System.out.println("A");
	}
}
class B extends A{
	void abc() {
		System.out.println("B");
	}
}class C extends B{
	void abc() {
		System.out.println("C");
	}
}class D extends C{
	void abc() {
		System.out.println("D");
	}
}
public class Test {
	public static void main(String[] args) {
		// A 
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		A a4 = new D();
		
		a1.abc(); //A
		a2.abc(); //B
		a3.abc(); //C
		a4.abc(); //D
		
		//B
		B b1 = new B();
		B b2 = new C();
		B b3 = new D();
		
		b1.abc(); //B
		b2.abc(); //C
		b3.abc(); //D
		
		//C
		C c1 = new C();
		C c2 = new D();
		
		c1.abc(); //C
		c2.abc(); //D
		
		//D
		D d1 = new D();
		
		d1.abc(); //D
	
	}
}
