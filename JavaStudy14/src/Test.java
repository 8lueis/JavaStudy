// static method 
class A{
	static void print() {
		System.out.println("A's static method");
	}
}
class B extends A{
	static void print() {
		System.out.println("B's static method");
	}
}
public class Test {
public static void main(String[] args) {
	A aa = new A();
	aa.print(); //A's static method
	
	B bb = new B();
	bb.print(); //B's static method
	((A)bb).print(); //A's static method
	
	A ab = new B();
	ab.print(); //A's static method
	((B)ab).print(); //B's static method
	
	
	System.out.println("🔽클래스로 호출하기🔽");
	A.print();
	B.print();
}
}
