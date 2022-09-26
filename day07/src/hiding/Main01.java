package hiding;
//public private
class User{
	public String name = "자바학생";	// 모든곳에서 접근가능
	private int age = 20; 			// private에서 적용된 항목은 객체를 통하여 접근 할 수 없다(은닉성).
									// (외부클래스에서 접근불가)
	
}





public class Main01 {

	public static void main(String[] args) {

		User user = new User();
		
		System.out.println(user.name);	//public 이므로 접근 가능
		
		// System.out.println(user.age);  private 이므로 접근 불가능
		
		
		
		
		
		
		
	}

}
