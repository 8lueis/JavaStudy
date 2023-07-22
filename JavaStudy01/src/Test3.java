//가변 길이 구하기
class A{
	void abc() {
		System.out.println(0);
	}
	void abc(int a) {
		System.out.println(1);
	}
	void abc(int a, int b) {
		System.out.println(2);
	}
	void abc(int a, int b, int c) {
		System.out.println(3);
	}
	void abc(int a, int b, int c, int d) {
		System.out.println(4);
	}
}
class B{
	void bcd(int...a) {
		System.out.println(a.length);
	}
}
public class Test3 {
	public static void main(String[] ar) {
		A a = new A();
		a.abc();
		a.abc(1);
		a.abc(1,2);
		a.abc(1,2,3);
		a.abc(1,2,3,4);
		
		B b = new B();
		b.bcd();
		b.bcd(1);
		b.bcd(1,2);
		b.bcd(1,2,3);
		b.bcd(1,2,3,4);
	}

}