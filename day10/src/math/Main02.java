package math;
//랜덤 숫자를 뽑아오는 메서드
public class Main02 {

	public static void main(String[] args) {
		/*
		 *  랜덤값 생성 -Math.random() 메서드는 0~1 범위를 갖는 double 형의
		 *  값을 리턴하기 때문에, 원하는 범위의 값을 생성하기 위해서는 일련의 공식이 필요하다.
		 *  
		 */
		System.out.println(Math.random());
		
		System.out.println(Main02.random(10, 20));
		System.out.println(Main02.random(1, 20));
		
	}

	//범위를 갖는 램덤값을 생성하여 리턴하는 메서드
	public static int random( int min, int max) {
		int num = (int) ( (Math.random() * (max - min +1) )  + min);
		return num;
	}
	
	
}















