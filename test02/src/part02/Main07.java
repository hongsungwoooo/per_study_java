package part02;

public class Main07 {
//7번
	public static void main(String[] args) {

		/*7. num 배열에 저장된 요소의 최대값을 출력하시오.(15)
		[배열]
		int[] num = {94, 85, 95, 88, 90};
			[출력 결과]
			최대값 : 95
		*/
		
		int[] num = {94, 85, 95, 88, 90};
		
		int max = num[0];
		
		for(int i= 0; i<num.length; i++) {
			if(max<num[i]) {
				max= num[i];
		
			}
		}
		
		System.out.println("최대 값 : " + max);
		
		
		
		
		
		
		
		
		
	}

}
