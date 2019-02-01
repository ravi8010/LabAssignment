package Lab2_5;
enum Gender1{
	m,f;
}

public class Person {
	String fname,lname;
	Gender1 gender;
	long pno;
	
	public long getPno() {
		return pno;
	}
	public void setPno(long pno) {
		this.pno = pno;
	}
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
	public Gender1 getGender() {
		return gender;
	}
	public void setGender(Gender1 gender) {
		this.gender = gender;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String fname, String lname, Gender1 gender,long pno) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.pno=pno;
	}
	void personDetails(String fname, String lname, Gender1 gender,long pno)
	{
		System.out.println("Person Details:"+"\n"+"_______________");
		System.out.println("First Name:"+getFname()+"\n"+"Last Name:"+getLname()+"\n"+"Gender:"+getGender()+"\n"+"PhoneNo:"+getPno());
	}
	
	

}
