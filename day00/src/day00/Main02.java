package day00;

public class Main02 {

	public static void main(String[] args) {
		// 1부터 몇까지 더해야 100을 넘지 않나

		for(int i = 1; i <= 10; i++) {
			if(i%3==0)
				continue;			//조건식이 참이되어 continue문이 실행되면
			System.out.println(i);	//블럭의 끝(1)으로 이동.
		/*(1)*/}					//break문과 다르게 반복문을 벗어나지 않는다.	

	}

}
