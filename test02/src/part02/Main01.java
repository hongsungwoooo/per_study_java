package part02;

public class Main01 {
//1번
	public static void main(String[] args) {
		//1.다음의 for 문을 while 문으로 변경하시오.(10)
		
		/* for(int i=0; i<=10; i++) {

             for(int j=0; j<=i; j++) {

                        System.out.print("*");

             }

             System.out.println();
          */   
             
		int num=11;
		int i = 1;
			while(i<=num) {
				int j = 1;
				while(j <=i) {
					System.out.print("*");
					j++;
				}
				System.out.println();
				i++;
			}
		
				
             
             

  }
}

