package part02;

public class Main08 {
//8번
	public static void main(String[] args) {

		
		/*
		 * 8번.num 배열에 저장된 요소의 홀수와 짝수의 합을 각각 구하시오. (15)
			[배열]
			int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};

			[출력 결과]

			짝수 : 20

			홀수 : 25	
		 */
			
		int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
			
		int num01=0;
		int num02=0;
			for(int i= 0; i< num.length; i++) {
				if(num[i] %2==0) {
					num01 += num[i];
				}
				 else {
					num02 += num[i];
				}
			}
			System.out.println("짝수 : "+ num01);
			System.out.println();
			System.out.println("홀수 : "+ num02);
		
		
		
		
	}

}
