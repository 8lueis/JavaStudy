package abc.bcd;
class A{
	int m = 3;
	int n = 4;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return m +", "+ n;
	}
}
class B{
	int m = 3;
	int n = 4;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return m +", "+ n;
	}
}
public class Test {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.toString());
		System.out.println(a.hashCode());
		System.out.println(a);
		
		B b = new B();
		System.out.println(b);
	}
}
