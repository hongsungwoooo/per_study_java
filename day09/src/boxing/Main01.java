package boxing;
//객체배열
public class Main01 {

	/*
	 * 부모클래스에 대한 객체 배열을 생성하고 배열의 요소에
	 * 자식 클래스 객체를 할당하면, 자동으로 암묵적 형변환이 이루어진다.
	 */
	
	public static void main(String[] args) {
		// 부대지정
		Unit[] units = new Unit[5];
		
		units[0] = new AirForce("공군 1호 ");
		units[1] = new AirForce("공군 2호 ");
		units[2] = new Navy("해군 1호 ");
		units[3] = new Army("육군 1호 ");
		units[4] = new Army("육군 2호 ");
		
		// 부대 일괄 공격
		for (int i= 0; i < units.length; i++) {
			units[i].attack();
			
		// instanceof 
		//	if( units[0] instanceof AirForce )	{
		//		AirForce temp = (AirForce)units[0]; 	오답
			
		if( units[i] instanceof Army) {
				Army a = (Army)units[i];
				a.tank();
		}else if( units[i] instanceof Navy) {
				Navy b = (Navy)units[i];
				b.nucleus();
		}else {
				AirForce f = (AirForce)units[i];
				f.bombing();
		}
		}


	
	
	}
}


