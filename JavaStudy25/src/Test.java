class A{
	int m = 5;
	void test() {
		System.out.println("A's method");
	}
}
class B extends A{
	int n = 6;
	void test2() {
		System.out.println("B's method");
	}
	void test() {
		System.out.println("A's method overriding");
	}
}
public class Test {
	public static void main(String[] args) {
		A a1 = new A();
		// a. -> m, test
		B b = new B();
		// b. -> m, n, test(), test2()
		b.test();
		A a2 = new B();
		// a2 -> only m, test() 
		// how can I use B class's method 
		if(a2 instanceof B) {
			System.out.println("a2 can downcasting");
		}
	}
}
