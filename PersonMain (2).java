package Lab2_5;

import java.util.Scanner;

public class PersonMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name");
		String fname=sc.next();
		System.out.println("Enter last Name");
		String lname=sc.next();
		System.out.println("Enter Phone no");
		long pno=sc.nextLong();
		boolean run=true;
		Gender1 egen=null;
		while(run) {
		
		System.out.println("Enter Gender");
		char gender=sc.next().charAt(0);
		
	
		if(gender=='m')
		{
			egen=Gender1.m;
			run=false;
		}
		else if(gender=='f') {
			egen=Gender1.f;
			run=false;
		}
		else {
			System.out.println("Enter either m/f.");
		}
		
		}
		Person per=new Person(fname,lname,egen,pno);
		per.personDetails(fname, lname, egen, pno);
		sc.close();
	}
}
