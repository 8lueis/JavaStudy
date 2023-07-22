
public class StringStudy {
	public static void main(String[] ar) {
		String aaa = "영화 [홍길동]에서 나오는 주인공의 나이는 [16]살이다.";
		System.out.println(aaa.indexOf("6"));
		System.out.println(aaa.indexOf("홍"));
		System.out.println(aaa.indexOf("6",7));
		System.out.println(aaa.indexOf('1',7));
	}
}
