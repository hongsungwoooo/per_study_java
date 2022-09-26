package object;

class User{
	String name;
	int age;
	
	User( String name, int age ){
		// 생성자 파라미터(지역변수)의 값을 멤버변수(전역변수)에 복사, 할당
		this.name = name;
		this.age = age;
	}
}

public class Main08 {
	
	public static void main(String[] args) {
		//생성자에 파라미터가 정의된 경우 객체 생성 구문에서 해당 파라미터를 반드시 전달해야 한다.
		User user = new User("사용자", 20);
		System.out.println(user.age);
		System.out.println(user.name);
		
	}

}
