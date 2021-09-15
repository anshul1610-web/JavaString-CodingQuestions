import java.util.Arrays;

public class WordReplace 
{

	public static void main(String[] args)
	{
	
	StringBuffer sb = new StringBuffer("Java is Object Oriented and Java is a good programmig Language Too");
	
	  String str = sb.toString();
	  String str1 = str.replaceAll("Java","C++");
	  
	  StringBuffer sb1 = new StringBuffer(str1);
	  System.out.println(sb1);
	
	}

}
