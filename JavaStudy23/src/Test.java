interface A{
	default void abc() {
		System.out.println("A interface's abc()");
	}
}
class B implements A{
	@Override
	public void abc() {
		// TODO Auto-generated method stub
		A.super.abc();
		System.out.println("B class's abc() method");
	}
}
public class Test {
	public static void main(String[] args) {
		// B class 객체 생성 및 method 호출 1
		B b = new B();
		b.abc();
		// A interface's abc()
		// B class's abc() method
		
		//2
		A ab = new B();
		ab.abc();
		
		//3 
		A a = new A() {
			public void abc() {
				A.super.abc();
				System.out.println("B class's abc() method");
			}
		};
		a.abc();
	}
}
