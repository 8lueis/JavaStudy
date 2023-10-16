class A {
	String name;

	A(String name) {
		this.name = name;
	}
}

class B { // equals() 메서드 overriding
	String name;

	B(String name) {
		this.name = name;
	}

	// object의 equals를 B의 equals로 재정의(override) 하고 있는 것
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof B) {
			if (this.name == ((B) obj).name)
				return true;
		}
		return false;
	}
}

public class Test {
	public static void main(String[] args) {
		A a1 = new A("hello");
		A a2 = new A("hello");

		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));

		B b1 = new B("hello");
		B b2 = new B("hello");

		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
	}
}
