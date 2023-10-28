class A{}
class B extends A{}

public class Test {
	public static void main(String[] args) {
		A a = new A();
		A ab = new B();
		
		if(a instanceof B) {
			System.out.println("T");
		}else {
			System.out.println("F");
		}
		
		if(ab instanceof B) {
			System.out.println("T2");
		}else {
			System.out.println("F2");
		}

	}
}