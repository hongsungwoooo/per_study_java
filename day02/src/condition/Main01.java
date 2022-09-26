package condition;

public class Main01 {

	public static void main(String[] args) {
		int myage = 20;
		
		if( myage == 19) {
			System.out.println("19살 입니다.");
		}
		
		if( myage != 20) {
			System.out.println("20살이 아닙니다.");
		}
		
		if( myage > 19)  {
			System.out.println("성인입니다.");     // 19살이 초과면 성인입니다.
		}
		
		if( myage <= 19)  {
			System.out.println("학생입니다.");		// 19살 이하면 학생입니다.
		}
		
		
		
		
	}

}
