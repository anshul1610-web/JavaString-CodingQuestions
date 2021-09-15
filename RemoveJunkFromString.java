
public class RemoveJunkFromString
{

	public static void main(String[] args) 
	{  
		String s = "@#$%anshu123*&";
		s =s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
	}

}
