// 최종 비교 
class A {
	int m = 3;
	static int n = 4;
	void abc() {
		System.out.println("A's instancde method");
	}
	static void bcd() {
		System.out.println("A's static method");
	}
}

class B extends A {
	int m = 30;
	static int n = 40;
	void abc() {
		System.out.println("B's instancde method");
	}
	static void bcd() {
		System.out.println("B's static method");
	}
}


public class Test {
	public static void main(String[] args) {
		//A 
		A a1 = new A();
		A a2 = new B();
		//B
		B b1 = new B();
		
		//instance field
		System.out.println(a1.m); //3
		System.out.println(a2.m); //3
		System.out.println(b1.m); //30

		//instance method
		a1.abc(); //A's instancde method
		a2.abc(); //B's instancde method
		b1.abc(); //B's instancde method
		
		//static field 
		System.out.println(a1.n); //4
		System.out.println(a2.n); //4
		System.out.println(b1.n); //40
		System.out.println(A.n); //4
		System.out.println(B.n); //40
		
		
		//static method
		A.bcd(); //A's static method
		a1.bcd(); //A's static method
		a2.bcd(); //A's static method
		
		B.bcd(); //B's static method
		b1.bcd(); //B's static method
		
	}
}
