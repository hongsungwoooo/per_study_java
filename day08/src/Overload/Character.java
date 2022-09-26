package Overload;
//overload
public class Character {

	private String job;
	private int age;
	
	public void setProperty( String job ) {
		this.job = job;
	}
		
	public void setProperty( int age ) {
		this.age = age;
	}

	public void setProperty( String job, int age ) {
		this.job = job;
		this.age = age;
	}
	
	public void setProperty( int age, String job ) {
		this.age = age;
		this.job = job;
	}
	
	public String toString() {
		return "Character [ job = " + this.job + ", age = "+ this.age+" ]";
	}
}
