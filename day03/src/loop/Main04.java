package loop;

public class Main04 {
// while문과 do~while문의 차이점 (한번은 반드시 실행되는 do~while문)
	public static void main(String[] args) {

		
		int max = 100;
	
		//while문
		while ( max > 100 ) {
			System.out.println("while문");
		}
		
		//do~while문
		do {
			System.out.println("do~while문");
		}while ( max > 100 );
		
		
	}

}
