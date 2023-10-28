
class A{
	void print1() {
		System.out.println("A class's print1");
	}
	void print2() {
		System.out.println("A class's print2");
	}
	int m = 3;
}
class B extends A{
	void print1() {
		System.out.println("B class's print1");
	}
	void print2(int a) {
		System.out.println("B class's print2");
	}
	int m = 4;
}
public class Test {
	public static void main(String[] args) {
		A aa = new A();
		aa.print1();
		aa.print2();
//		System.out.println(((B)aa).m);
		
		B bb = new B();
		bb.print1();
		bb.print2();
		bb.print2(5);

		
		A ab = new B();
		ab.print1();
		ab.print2();

	}
}
