// 필드 
class A{
	int m = 3;
}
class B extends A{
	int m = 4;
}

public class Test {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.m); //3
		
		B b = new B();
		System.out.println(b.m); //4
		System.out.println("A class 값 3으로 출력하기");
		System.out.println(((A)b).m);
		
		System.out.println("---------");
		
		A ab = new B();
		System.out.println(ab.m); //3
		System.out.println("B class 값 4로 출력하기");
		System.out.println(((B)ab).m);

	}
}
