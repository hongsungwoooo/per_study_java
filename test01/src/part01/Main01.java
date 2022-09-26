package part01;

public class Main01 {
//1번
	public static void main(String[] args) {

		int num = 0;
		for (int i = 1; i <=20; i++) {
			if(i % 2 != 0 && i % 3 !=0) {
				num = num +i;
			}
		}
		System.out.println(num);
		
		}
	
	}


