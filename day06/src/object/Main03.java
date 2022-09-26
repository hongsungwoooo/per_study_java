package object;

class HelloWorld{
	String message;
	
	void sayHello(){ //message를 출력해주는 역할
		System.out.println(message);
	}
	void setEng() {		//전역변수 할당
		message = "Hello Java";
	}
	void setKor() {		
		message = "안녕하세요 자바";
	}
}

public class Main03 {

	public static void main(String[] args) {
		/*
		 * HelloWorld 클래스로 객체 생성
		 * [결과값]
		 * Hello Java
		 * 안녕하세요 자바
		 */

	HelloWorld hello = new HelloWorld();
	//Hello Java
	hello.setEng();
	hello.sayHello();
	
	//안녕하세요 자바
	hello.setKor();
	hello.sayHello();
		
		
		
		
		
		
		
		
		
	}

}
