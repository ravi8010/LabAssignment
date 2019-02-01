import java.util.Scanner;

public class Lab2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname,lname,gender;
		int age,weight;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person Details:");
		fname=sc.next();
		lname=sc.next();
		gender=sc.next();
		age=sc.nextInt();
		weight=sc.nextInt();
		System.out.println("Person Details:"+"\n"+"_______________");
		System.out.println("First Name:"+fname+"\n"+"Last Name:"+lname+"\n"+"Gender:"+gender+"\n"+"Age:"+age+"\n"+"Weight:"+weight);
		

	}

}
