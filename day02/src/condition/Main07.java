package condition;

public class Main07 {

	public static void main(String[] args) {
		char grade = 'A';
		
		/*
		 *  grade가 A 또는 B 또는 C일 경우 : Pass
		 *  그 외 Not-Pass
		 */
		
		switch ( grade ) {
			case 'A' :
			case 'B' :
			case 'C' :
				System.out.println("Pass");
					break;
			default :
				System.out.println("Not-Pass");
					break;
		}
		
	}

}
