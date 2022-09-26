package DbmsTest;
//1. Calc 클래스를 생성 한다.(10점)

public class Calc {							

//2. private 접근제어의 String 타입의 전역변수 생성하고 getter, setter, 파라미터가 있는 생성자를 생성한다.(10점)	
	
	private String plus;					
	private String minus;		
	private String times;
	private String divide;

	public Calc(String plus, String minus, String times, String divide) {
		super();
		this.plus = plus;
		this.minus = minus;
		this.times = times;
		this.divide = divide;
	}

	public String getPlus() {
		return plus;
	}

//	3. int 타입의 파라미터를 2개받아와서 int 타입의 덧셈의 결과를 return해주는 메서드를 생성 한다.(5점)

	public int setPlus(int x, int y) {
		int result = x +y;
		return result;
	}

	public String getMinus() {
		return minus;
	}

//	4. int 타입의 파라미터를 2개받아와서 int 타입의 뺄셈의 결과를 return해주는 메서드를 생성 한다.(5점)

	public int setMinus(int x, int y) {
		int result = x -y;
		return result;
	}

	public String getTimes() {
		return times;
	}

//	5. int 타입의 파라미터를 2개받아와서 int 타입의 곱셈의 결과를 return해주는 메서드를 생성 한다.(5점)

	public int setTimes(int x, int y) {
		int result = x *y;
		return result;
	}

	public String getDivide() {
		return divide;
	}

//	6. int 타입의 파라미터를 2개받아와서 int 타입의 나눗셈 몫의 결과를 return해주는 메서드를 생성한다. (5점) 

	public int setDivide(int x, int y) {
		int result = x / y;
		if( y!=0) {
		}
		return result;
	}
	
	
	
	
	
}
