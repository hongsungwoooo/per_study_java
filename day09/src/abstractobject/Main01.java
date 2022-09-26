package abstractobject;

public class Main01 {

	public static void main(String[] args) {
		
		Unit[]	units = new Unit[3];
		
		units[0] = new Army("육군!");
		units[1] = new Navy("해군!");
		units[2] = new AirForce("공군!");
		
		for(int i= 0; i< units.length; i++) {
			units[i].move();
			units[i].attack();
		
		
		if(units[i] instanceof Army) {
			Army a = (Army)units[i];
			a.tank();
		}else if(units[i] instanceof Navy){
			Navy n = (Navy)units[i];
			n.nucleus();
		}else {
			AirForce f = (AirForce)units[i];
			f.bombing();
		}
		}
		
		/*	//강사님답안
		 *  Army army = new Army("육군");
		 *  
		 *  
		 *  army.attack();
		 *  army.move();
		 *  
		 *  
		 */
		
	}

}
