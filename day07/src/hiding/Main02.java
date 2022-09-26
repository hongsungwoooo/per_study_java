package hiding;
//getter, setter
class Student{
	// 은닉된 변수 -> 현재 블록 안에서만 접근 가능함
	private String name;
	private int age;
	
	//name getter
	public String getName() {				//값을 획득
		return this.name;
	}
	
	//name setter
	public void setName(String name) {		// 값을 할당, 파라미터는 권역변수와 맞추는게 좋다
		this.name = name;
	}
	
	// age getter
	public int getAge() {
		return this.age;
	}
	
	// age setter
	public void setAge( int age){
		this.age = age;
	}
}

public class Main02 {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("자바학생");
		s.setAge(20);
		
		String name = s.getName();
		System.out.println("이름 : " + name);
		
		
		System.out.println("나이 : " + s.getAge());
	
	
	
	
	}

}
