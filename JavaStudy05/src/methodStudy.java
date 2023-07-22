import java.util.Arrays;

public class methodStudy {
	public static void main(String[] ar) {
		int[] array = new int[] {1,2,3};
//		modifyData(array); //값이 변경된 후
//		printArray(array); //출력 메서드로 출력
		printArray(array);
		modifyData(array);
	}
	
	public static void modifyData(int[] a) {
		a[0]=4; a[1]=5; a[2]=6;
	}
	
	public static void printArray(int[] a){
		System.out.println(Arrays.toString(a));
	}
}
