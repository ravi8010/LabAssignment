package Lab3;

import java.util.Scanner;

public class Lab3_1 {
	
	
	
	static String str;
public static	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		while(true)
		{
		
		System.out.println("1: AddString"+"\n"+"2:Replace odd positions with #"+"\n"+"3:Remove duplicate characters in the String"+"\n"+"4:Change odd characters to upper case"+"\n"+"5:Exit");
		
		 int n=sc.nextInt();
		 System.out.println("enter a string");
		 str=sc.next();
	
		
		switch(n)
		{
			case 1:addString();
		     break;

			case 2:replacePosition();
		     break;

			case 3:duplicateString();
		     break;

			case 4:oddCharToUpper();
		     break;
			case 5:System.exit(0);
		     break;
			default:System.out.println("Invalid choice");
			      break;
			
		}
		
		}
	}


	private static void oddCharToUpper() {
		// TODO Auto-generated method stub
		
		
		char[] chr=str.toCharArray();
		int i;
		for( i=0;i<chr.length;i++)
		{
			if(i%2==0)
			{
				if(chr[i]>='a'&&chr[i]<='z')
				{
				chr[i]=(char) (chr[i]-32);	
				}
				
			}
			
			
		}
		System.out.println(new String(chr));
		
		  
		
	}

	private static void duplicateString() {
		// TODO Auto-generated method stub
		
		char[] chr=str.toCharArray();
		String s = "";
		int i,j;
		for(i=(chr.length)-1;i>0;i--)
		{
			for(j=i-1;j>=0;j--)
			{
				if(chr[j]==chr[i])
				{
					chr[i]='0';	
				}
				
			}
		
		}
		for(j=0;j<chr.length;j++)
		{
			if(chr[j]!='0')
			{
				s=s+chr[j];	
			}
			
		}
		
		System.out.println(s);
		
		
	}

	private static void replacePosition() {
		// TODO Auto-generated method stub
		
		char[] chr=str.toCharArray();
		int i;
		for( i=0;i<chr.length;i++)
		{
			if(i%2==0)
			{
				chr[i]='#';
			}
		}
		
		System.out.println(new String(chr));
		
		
	}

	private static void addString() {
		// TODO Auto-generated method stub
		
		
		str+=str;
		System.out.println(str);
		
		
	}
	

}
