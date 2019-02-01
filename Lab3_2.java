package Lab3;

import java.util.Scanner;

public class Lab3_2 {
	static Scanner sc=new Scanner(System.in);
	
	static String str=sc.next();

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(stringcheck()==true)
		{
			System.out.println("Positive String.");
		}
		else
		{
		System.out.println("Negative String");
		}

	}

	private static boolean stringcheck() {
		// TODO Auto-generated method stub
		System.out.println("enter string");
		String str=sc.next();
		char[] chr=str.toCharArray();
		int i,f=0;
		for(i=0;i<chr.length-1;i++)
		{
			int j=i+1;
			if((int)chr[j]>(int)chr[i])
			{
				f+=1;
			}
			else
			{
			break;
		}}
		if(f==((chr.length)-1))
		{
			return true;
		}
		else
			return false;
	}*/
	//char[] chr=str.toCharArray();
	public static void main(String[] args) {
	int a;
	a=(str.length())-1;
	if(str.charAt(a)=='i')
	{
		System.out.println("Mahilao ka naam");
	}
	else if(str.charAt(a)=='a')
	{
		System.out.println("Puruso ka naam");

	}
	else {
		System.out.println("Hizada hai tu");
	}
}}
