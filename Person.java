package Lab2_3;

public class Person {
	String fname,lname;
	char gender;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String fname, String lname, char gender) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
	}
	

}
