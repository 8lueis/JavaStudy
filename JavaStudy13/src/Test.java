// static field 
class A{
	static int m = 3;
}
class B extends A{
	static int m = 4;
}
public class Test {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.m); //3
		
		B b = new B();
		System.out.println(b.m); //4
		System.out.println(((A)b).m); //3
		
		A ab = new B();
		System.out.println(ab.m); //3
		System.out.println(((B)ab).m); //4
		
		//클래스 이름으로 바로 접근 
		//static이니까 가능 
		System.out.println(A.m); //3
		System.out.println(B.m); //4
	}
}
