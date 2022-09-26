package operator;

public class Main06 {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int x = 5;
		int y = 3;
		
		// 논리연산
		boolean result1 = a != b || a == b; // true || false -> true
		boolean result2 = a < b || x > y;	// true || true  -> true
		boolean result3 = a < b || x < y;	// true || false -> true
		boolean result4 = a > b || x > y;	// false || true -> true
		boolean result5 = a > b || x < y;	// false || false -> false
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println("--------------------------");
		
		// boolean 값 끼리는 논리연산이 가능하다
		boolean r1 = a >= b;			//false
		boolean r2 = x >= y;			//true
		boolean result6 = r1 && r2;		//false
		boolean result7 = r1 || r2;		//true
		
		System.out.println(result6);
		System.out.println(result7);
		System.out.println("--------------------------");
		
		boolean success = true;
		boolean fail = !success; 		// !true -> false / !false -> true
		System.out.println(fail);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
