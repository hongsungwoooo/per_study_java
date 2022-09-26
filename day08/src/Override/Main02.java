package Override;
//상속관계 생성자처리
class Hello2{
	Hello2(String msg){						//직접쓰지않아도 기본으로 만들어주는 기본생성자
		System.out.println(msg);
	} 
}

class Korean2 extends Hello2{				//부모클래스 생성자 정의되어있기 떄문에 자식클래스에 부모클래스생성자에
											//맞는 생성자를 만들어야한다.
	Korean2(String msg) {					// <- 부모클래스에 맞는 생성자틀
		super(msg);							// 부모와 동일한 파라미터를 받도록 생성자를 정의하고
	}										// 전달 받은 파라미터를 부모에게 재전달 해야 한다.
}

public class Main02 {

	public static void main(String[] args) {
		Korean2 kor = new Korean2("사용자");
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
