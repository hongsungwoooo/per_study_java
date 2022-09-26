package wrapperclass;
//Wrapper 클래스의 형변환을 이용한 사칙연산
public class Main01 {

	public static void main(String[] args) {
		String a = "20";
		String b = "3.14";
		
		/*
		 * Wrapper 클래스의 가장 중요한 기능은 특정 데이터형의 모양을 하고있는
		 * 문자열을 실제 데이터형으로 변환하는 기능이다.
		 *
		 */
		
		int num_a = Integer.parseInt(a);
		float num_b= Float.parseFloat(b);
		
		// 이렇게 변환된 값은 사칙연산이 가능하다
		int v1 = num_a + 500;
		float v2 = num_b + 500;
		
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
