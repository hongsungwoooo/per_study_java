package Override;
//수업 한정 하나의 클래스에 여러 메서드

class Hello {
	public void say() {
		System.out.println("Hello");
	}
}

class Korean extends Hello{					
	public void say() {						// Korean 클래스의 의해 say()메서드가 Override 된 경우
		System.out.println("안녕하세요");
	}


	public void sayHello() {
		super.say();				// 부모클래스의 say
		this.say();					// 나 자신(korean)의 say
	}

}


public class Main01 {

		public static void main(String[] args) {
			Korean kor = new Korean();
			kor.sayHello();
			System.out.println("-----------");
			kor.say();
			
		}
}

