class A {
	int m = 3;
	static int n = 4;
	void abc() {
		System.out.println("A's instancde method");
	}
	static void bcd() {
		System.out.println("A's static method");
	}
	A(){}
	A(int a){}
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
		A a1 = new A();
		A a2 = new B();
		B b1 = new B();	

		System.out.println(a1.m); 
		System.out.println(a2.m); 
		System.out.println(b1.m); 

		a1.abc();
		a2.abc(); 
		b1.abc();
		
		System.out.println(a1.n);
		System.out.println(a2.n); 
		System.out.println(b1.n); 
		System.out.println(A.n); 
		System.out.println(B.n); 

		A.bcd();
		a1.bcd(); 
		a2.bcd(); 
		
		B.bcd(); 
		b1.bcd();
		System.out.println(a1);
		System.out.printf("%x\n",a1.hashCode());
		
	}
}