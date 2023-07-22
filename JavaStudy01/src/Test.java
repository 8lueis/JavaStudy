import java.util.Arrays;

//퍼블릭 클래스는 파일에 하나, 퍼블릭 메서드는 클래스 하나 안에 여러 개 가능

public class Test {
	public static void main(String[] ar) {
		int[] array = new int[] {1,2,3};
		modifyData(array);
		printArray(array);
	}
	public static void modifyData(int[] a) {
		a[0]=4; a[1]=5; a[2]=6;
	}
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}
