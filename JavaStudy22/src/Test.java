interface A{
	void abc();
	default void bcd() {
		System.out.println("A interface's bcd() method");
	}
}

// implement를 class에 상속하는 방법 
// public으로 method 완성시키기 
class B implements A{
	@Override
	public void abc() {
		System.out.println("B에서 완성한 abc method");
	}
}
class C implements A{
	@Override
	public void abc() {
		System.out.println("C에서 완성한 abc method");
	}
	@Override
	public void bcd() {
		System.out.println("C에서 완성한 bcd method");
	}
}
public class Test {
	public static void main(String[] args) {
		B b = new B();
		b.abc(); //B에서 완성한 abc method
		b.bcd(); //A interface's bcd() method
		
		C c = new C();
		c.abc(); //C에서 완성한 abc method
		c.bcd(); //C에서 완성한 bcd method
	}
}
