import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationClass
{

	public static void main(String[] args) 
	{
		
		System.out.println("please enter your mobile number");
		Scanner sc = new Scanner(System.in);
		String s1 =  sc.nextLine();
		String s2 =  sc.nextLine();
		
		//for Mobile Validation
		
		Pattern p =  Pattern.compile("[789][0-9]{9}");
        Matcher m = p.matcher(s1);
        if(m.find()&& m.group().equals(s1))
        {
        	System.out.println("valid mobile number");
        }
        else
        {
        	System.out.println("invalid mobile number");
        }
        
        //for Email Validation
       
        System.out.println("please enter your mail id");
        Pattern p1=  Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z])+");
        Matcher m1 = p.matcher(s2);
        if(m.find()&& m.group().equals(s2))
        {
        	System.out.println("valid mail id");
        }
        else
        {
        	System.out.println("invalid mail id");
        }
	}

}