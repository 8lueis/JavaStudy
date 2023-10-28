abstract class A{
	abstract void abc();
}		
//1.
class B extends A{
	void abc(){
		System.out.println("완성1");
	}
}
public class Test {
	public static void main(String[] args) {
		A a = new A(){
			void abc(){
				System.out.println("완성2");
			}
	};
	B b = new B();
	b.abc();
	a.abc();
	}
}
