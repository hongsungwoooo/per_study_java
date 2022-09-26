package object;
/*
 *  this 키워드를 활용한 멤버변수와 메서드의 접근
 *  - 멤버변수는 지역변수와 구별하기 위하여 가급적 this를 통하여 접근한다.
 *  - 메서드는 접근할 때 this 키워드를 사용하는 것이 필수적인 것은 아니다.
 */
class Member{
	String name;	//(0-4)"자바학생"
	int age;		//(1-4)"20"
	
	String getName() { return this.name; }
		
	void setName( String name ) { this.name = name; }
		//(0-2)									(0-3)
	int getAge() { return this.age; }

	void setAge( int age ) { this.age = age; }
		//(1-2)							(1-3)
	void say() {
					
		System.out.println(this.getName());
		System.out.println(getAge());
	}
	
}

public class Main06 {

	public static void main(String[] args) {
		Member member = new Member();
		member.setName("자바학생"); 	//(0-1)
		member.setAge(20);			//(1-1)
		member.say(); 				
		
	}

}
