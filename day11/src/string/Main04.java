package string;
// 기본 자료형을 문자열로 변환하는 방법
public class Main04 {

	public static void main(String[] args) {
		// 기본 자료형을 문자열로 변환하는 방법
		int a = 1;
		float b = 3.14f;
		boolean c = true;
		double d = 123.4567d;
		long e = 123456789L;
		
		/*
		 *  static 메이서 valueOf
		 *  --------------------
		 *  기본 데이터형을 String 객체로 변환해 주는 메서드
		 *  다양한 자료형에 오버로드 되어 있다.
		 */
		
		
		String str1 = String.valueOf(a);
		String str2 = String.valueOf(b);
		String str3 = String.valueOf(c);
		String str4 = String.valueOf(d);
	
		// 하지만 문자열로 변환하는 가장 손쉬운 방법은 공백을 더하는 것이다.
		String str5 = ""+ e;
		
		
		//instanceof 를통해 String 여부확인
		System.out.println(str1 instanceof String);
		System.out.println(str2 instanceof String);
		System.out.println(str3 instanceof String);
		System.out.println(str4 instanceof String);
		System.out.println(str5 instanceof String);
		
		
		
		
		
		
		
		
		
		
		
	}

}
