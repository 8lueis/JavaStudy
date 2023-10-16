class A{
	A(){
		System.out.println("A1");
	}
	A(int a){
		this();
		System.out.println("A2");

	}
	A(int a, int b){
		this(3);
		System.out.println("A3");

	}
}
class B extends A{
	B(){
		System.out.println("B1");
	}
	B(int a){
		super(5);
		System.out.println("B2");

	}
	B(int a, int b){
		this();
		System.out.println("B3");
	}
}
public class Test {
public static void main(String[] args) {
		//A
		A a1 = new A(); //A1
		A a2 = new A(2); //A1 A2
		A a3 = new A(2,3); //A1 A2 A3
		
		//B
		B b1 = new B(); //A1 B1
		B b2 = new B(2); //A1 A2 B2
		B b3 = new B(2,3); //A1 B1 B3
}
}
