package part02;

public class Main05 {
//5번
	public static void main(String[] args) {

		/*5.

		2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.(15)

		[배열]

		int[][] arr = {

		{ 5, 5, 5, 5, 5},

		{10,10,10,10,10},

		{20,20,20,20,20},

		{30,30,30,30,30}
		
		};

		[출력 결과]

		total=325

		average=16
		
		*/
		
		int[][] arr = {

				{ 5, 5, 5, 5, 5},

				{10,10,10,10,10},

				{20,20,20,20,20},

				{30,30,30,30,30}
				
				};
		
		int total=0;
		int average= 0;
		int sum =0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
			sum += arr[i].length;
		}
		
		average= (total/sum);
		
		System.out.println(" total = "+ total );
		System.out.println(" average = " + average);
		
	}

}
