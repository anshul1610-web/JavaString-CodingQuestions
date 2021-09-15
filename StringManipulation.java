import java.util.regex.Pattern;

public class StringManipulation 
{

	public static void main(String[] args) 
	{
		String s = "lets take a tnap";
		String s1 = "lets Take a tnap";
		//for length
		System.out.println("lenth of String is: "+  +s.length());
		
		
		//to find char at given index
		System.out.println("chr at 10 is: "+  +s.charAt(10));
		System.out.println("chr at 10 is: "+  +s.charAt(5));

		
		//to find index of given char
		System.out.println("index of chr  is: "+  +s.indexOf("a"));
		System.out.println("index of chr  is: "+  +s.indexOf("t",s.indexOf("t")+1));
		System.out.println("index of chr  is: "+  +s.indexOf("take"));
		System.out.println("index of chr  is: "+  +s.indexOf("aaaaa"));
		
		//String Comparison
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		
		//SubString
		System.out.println(s.substring(0,9));
		
		//trim and replace
		System.out.println(s.trim());
		System.out.println(s.replace("t","a"));
		System.out.println(s.replace(" ","/"));
		
		//Splittt
		String s2 = "i_am_coming_home";
		String[] s3 = s2.split("_");
		System.out.println(s3.length);
		for(int i=0;i<s3.length;i++)
		{
			System.out.print(" "+s3[i]);
		}
		
		
		
	
		
		
		
	}

}
