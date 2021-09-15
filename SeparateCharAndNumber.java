import java.util.Scanner;

public class SeparateCharAndNumber 
{

	
	public static void StringSeparte(String str) 
	{
		String s1 = " ";
		String s2 = " ";
		String s3 =" ";
	
		for(int i=0;i<str.length();i++) 
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				s1+= str.charAt(i);			}
		    else if(Character.isDigit(str.charAt(i)))
			{
				s2+= str.charAt(i);
			}
		    else 
		    {
		        s3+= str.charAt(i);	
		    }
		}
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
	}
	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		String str = sc.nextLine();
		
		StringSeparte(str);
	}

	
}
