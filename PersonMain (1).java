package Lab2_4;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name");
		String fname=sc.next();
		System.out.println("Enter last Name");
		String lname=sc.next();
		System.out.println("Enter Gender");
		char gender=sc.next().charAt(0);
		System.out.println("Enter Phone no");
		long pno=sc.nextLong();
		Person per=new Person(fname,lname,gender,pno);
		
		per.personDetails(fname, lname, gender, pno);
		sc.close();
		

		

	}

}
