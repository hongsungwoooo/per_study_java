package day00;

public class Main01 {

	public static void main(String[] args) {
		
		for(int i = 1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		
		for(int i1= 5; i1>=1; i1--) {
			for(int j1 = 1; j1<=i1; j1++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
