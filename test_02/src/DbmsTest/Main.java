package DbmsTest;

//7. main 메서드를 포함하는 클래스를 생성 한다.(10점)

public class Main {

	public static void main(String[] args) {
		
//8. 2개의 정수를 입력 받는다.(10점)

		int a = 30;
		int b = 10;

//9. 입력 받은 정수를 각각 출력 한다.(10점)

		System.out.println(a);
		System.out.println(b);
		
//10. main 메서드에서 Calc 클래스 객체 생성시 본인의 이름을 매개변수 값으로 넘긴다.(5점)

		Calc calc = new Calc("plus","minus","times", "divde");
		
//11. main 메서드에서 본인의 이름을 출력한다.(5점)

		System.out.println(calc.getPlus());
		System.out.println(calc.getMinus());
		System.out.println(calc.getTimes());
		System.out.println(calc.getDivide());
		
//12. Calc 클래스 객체를 사용하여 plus, minus 메소드를 사용하여 사칙 연산 결과를 각각 출력 한다.(10점)

		System.out.println("덧셈 30 + 10 = "+calc.setPlus(a, b));
		System.out.println("뺄셈 30 - 10 = "+calc.setMinus(a, b));

//13. Calc 클래스 객체를 사용하여 times, divide 메소드를 사용하여 사칙 연산 결과를 각각 출력 한다.(10점)

		System.out.println("곱셈 30 * 10 = "+calc.setTimes(a, b));
		System.out.println("나눗셈 30 / 10 = "+calc.setDivide(a, b));
	  
	  
	  
	  
	  
	  
	  
		
	}

}
