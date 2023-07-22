class B{
	B(){
		System.out.println("첫 번째 생성자");
	}
	B(int a){
		this();
		System.out.println("두 번째 생성자");
	}
}
public class Test {
	public static void main(String[] ar) {
		B b1 = new B();
		B b2 = new B(3);

	}
}
