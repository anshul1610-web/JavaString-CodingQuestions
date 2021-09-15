import java.util.Scanner;

public class StringCasting 
{

	public static void main(String[] args) 
	{
		 System.out.println("Enter the String:  ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
	int vcount=0;
	int ccount=0;
	 s=s.toLowerCase();
	
		
		for(int i=0;i<s.length();i++) 
		{
			char ch = s.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
			{
				vcount++;
			}
			else
			{
				ccount+=2;
			}
			
		}
		System.out.println("no. of vowel "+vcount);
		System.out.println("no. of consonant "+ccount);
		System.out.println(ccount+vcount);
		
	}

}
