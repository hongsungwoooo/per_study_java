package Sql_Test;
//7. main 메서드를 포함하는 클래를 생성(10)
public class Main {

	public static void main(String[] args) {
//8. Student 클래스 객체 생성(10)
		Student student = new Student("홍길동", 3, 10, 100, 100, 100);
		
//9. Student 클래스의 총합, 평균값을 출력하는 메서드 호출(10)
		System.out.println("kor, eng, math 총합 : "+ student.sum());
		System.out.println("kor, eng, math 평균 : "+ student.average());
		
//10. Student 클래스의 name, ban, no, kor, eng, math 를 출력하는 메서드 호출(10)
		student.read();
		
	}

}
