//가변 길이 배열 매개변수 
//메서드의 매개변수로 전달된 원소의 개수만큼 배열을 생성하여 사용

public class Test2 {
	public static void main(String[] ar) {
		method1(1,2);
		method1(1,2,3);
		method1();
	}
	
	public static void method1(int...values) {
		System.out.println("매개변수 길이: "+values.length);
		for(int i=0; i<values.length; i++) {
			System.out.println(values[i]+" ");
			System.out.println();
		}
	
	}
}
