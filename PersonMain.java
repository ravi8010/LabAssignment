package Lab2_3;

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
		Person per=new Person(fname,lname,gender);
		
		System.out.println("Person Details:"+"\n"+"_______________");
		System.out.println("First Name:"+per.getFname()+"\n"+"Last Name:"+per.getLname()+"\n"+"Gender:"+per.getGender());
		sc.close();
		

		

	}

}
