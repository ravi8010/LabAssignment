package Lab3;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Date");
     int date1=sc.nextInt();
     System.out.println("Enter month");
     int month=sc.nextInt();
     System.out.println("Enter Year");
     int year=sc.nextInt();
     LocalDate ld=LocalDate.of(year,month,date1);
     LocalDate now1=LocalDate.now();
     Period period = Period.between(ld,now1);
      System.out.println("Duration=Days:"+period.getDays()+"\n"+"Years: "+period.getYears()+"\n"+"Months: "+period.getMonths());

     
     
    		 
     
	}

}
