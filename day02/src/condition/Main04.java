package condition;

public class Main04 {

	public static void main(String[] args) {
		int point = 87;
		
		/*
		 * 90점 초과, 100점 이하면 -> A
		 * 80점 초과, 90점 이하면  -> B
		 * 70점 초과, 80점 이하면  -> C
		 * 그 외 				   -> F
		 * 
		 */
		
		if( point > 90 && point <= 100 ) {
			System.out.println("A");
		} else if ( point > 80 && point <= 90 ) {
			System.out.println("B");
		} else if ( point > 70 && point <= 80 ) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
		
		
		
	}

}
