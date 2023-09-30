//메서드 오버로딩 vs. 오버라이딩

class A {
	void print1() {
		System.out.println("A class print1");
	}
	void print2() {
		System.out.println("A class print2");
	}
}
class B extends A {
	void print1() {
		System.out.println("B class print1");
	}
	void print2(int a) {
		System.out.println("B class print2");
	}
}


public class Test {
	public static void main(String[] args) {
		//A - A
		A aa = new A();
		aa.print1(); //A class print1
		aa.print2(); //A class print2
		
		//B - B
		B bb = new B();
		bb.print1(); // B class print1
		bb.print2(); //A class print2
		bb.print2(3); //B class print2
		
		//A - B
		A ab = new B();
		ab.print1(); // A class print1
		ab.print2(); // A class print2
//		ab.print2(3); error
	}
}
