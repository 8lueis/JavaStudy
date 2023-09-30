class A2{
	int m = 3;
}

class B2 extends A2{
	int m = 4;
}

public class Test2 {
public static void main(String[] args) {
	// 객체 생성 
	A2 a = new A2();
	B2 b = new B2();
	A2 ab = new B2();
	
	// instance field 결과
	System.out.println(a.m); //3
	System.out.println(b.m); //4
	System.out.println(ab.m); //3
}
}
