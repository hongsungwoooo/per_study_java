package part02;

public class Main06 {
//6번
	public static void main(String[] args) {

/*6. 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 
변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라.
단 가능한 한 적은 수의 동전으로 거슬러 주어야한다 
(1) 에 알맞은 코드를 넣어서(1줄 이상 일 수 있다.), 프로그램을 완성하시오. (15)
큰 금액의 동전을 우선적으로 거슬러 줘야한다
*/ 
		/*[출력 결과]

		money=2680

		500원 : 5

		100원 : 1

		50원: 1

		10원 : 3
		
		
		*/
		
		      int[] coinUnit = { 500, 100, 50, 10 };

		         int money = 2680;

		         System.out.println("money=" + money);
		         System.out.println(" ");
		         for (int i = 0; i < coinUnit.length; i++) {

		                    System.out.println(coinUnit[i]+"원 : "+ money / coinUnit[i]);        //(1)
		                    System.out.println(" ");
		                    money= money %coinUnit[i];

		}
		
	}

}
