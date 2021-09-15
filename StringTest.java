import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest 
{

	public static void main(String[] args) 
	{
		int count=0;
		System.out.println("Enter the String");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		
		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher(str);
		
		while(m.find())
		{
			str = str.replaceAll("[^a-zA-Z]", "*");
			count++;
			System.out.println("index is "+m.start());
			
		}
		System.out.println(str);
		System.out.println("Number of occurences"+ " " +count);
		System.out.println("...............................................................................");
		
		
		String[] sr = str.split("[0-9]");
		for(String sr1:sr) 
		{
			System.out.println(" " +sr1);
		}
		
		System.out.println("...............................................................................");
		System.out.println(str.substring(3, 4));
		
		
		
	}

}
