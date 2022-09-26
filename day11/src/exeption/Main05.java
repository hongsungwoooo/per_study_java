package exeption;

public class Main05 {

	public static void main(String[] args) {
		try {
			int[] arr = new int[3];
			for( int i = 0; i < 5; i++) {
				arr[i] = i;					// i가 3일때 에러가 발생
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException f) { // 에러내용 삽입
			System.out.println("에러발생");
			System.out.println("원인 : "+ f.getMessage());
			
			f.printStackTrace();
		}
		
		System.out.println("end of program");
	}
}
