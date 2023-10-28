class C{
	void abc() {
		System.out.println("B's parent");
	}
}
interface A{
	default void abc() {
		System.out.println("A interface's abc()");
	}
}
class B extends C implements A{
	public void abc() {
		A.super.abc();
		System.out.println("B class's method");
		System.out.println("🔽super.abc🔽");
		super.abc();
	}
}
public class Test {
	public static void main(String[] args) {
		B b = new B();
		b.abc();
	}
}
