package part01;

public class Main02 {
//2번
	public static void main(String[] args) {
		
		/*2.
		1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과를 계산하시오
		*/
		
		int sum = 0;
		for(int i = 1; i<=10; i++ ) {
			for(int j = 0; j <= i; j++) {
				sum = sum + j;
			}
		}
		System.out.println("결과 값 : " + sum);
		
	}

}
