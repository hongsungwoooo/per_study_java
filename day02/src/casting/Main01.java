package casting;

public class Main01 {

	public static void main(String[] args) {
		short s = 100;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println("-------------------------");
		
		
		int myage1 = 20;
		double myage2 = myage1;
		System.out.println(myage2);
		
		
		
		
	}

}
