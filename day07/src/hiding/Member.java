package hiding;
//자바빈즈의 형태
public class Member {
	private String name;
	private int age;

	// 파라미터가 있는 생성자
	// 자동완성 클래스 내부 마우스오른쪽 source -> generate Constructor using field
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}


	//getter,setter
	//자동완성 마우스오른쪽 source -> getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
		}

	public void setAge(int age) {
		if( age>=0) {
			this.age = age;
		}else {
			this.age = 0;
		}
	
	}
	

	
	
	
	
	
	
}
