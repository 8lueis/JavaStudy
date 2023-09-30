// 메서드 오버라이딩 접근 지정자 
class A{
	protected void abc() {};
}
class B1 extends A{
	public void abc() {};
}
class B2 extends A{
	protected void abc() {};
}
//class B3 extends A{
//	void abc() {};
//}
//class B4 extends A{
//	private void abc() {};
//}

public class Test {

}
