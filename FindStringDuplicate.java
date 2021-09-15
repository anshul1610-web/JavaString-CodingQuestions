import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindStringDuplicate 
{

	public static void main(String[] args) 
	{
		
		String s = "I am coming Home ";
		String S = "I AM COMING HOME ";
		String s1 = " ";
		
		
		for(int i =s.length()-1;i>=0;i--) 
		{
			s1 =s1+s.charAt(i);
		}
		System.out.print("Using Loop : ");
          System.out.println(s1);
          
          StringBuffer sb = new StringBuffer(s);
          System.out.print("Using reverse mtd : ");
          System.out.println(sb.reverse());
          
          
          System.out.println("substring : "+s.substring(5));
          System.out.println("substring : "+s.substring(0,4));
          
          Pattern p = Pattern.compile("o");
          Matcher m= p.matcher(s);
          
          int count =0;
          while(m.find()) 
          {
        	  count++;
        	  System.out.println(m.start()+"   "+m.group());
          }
          System.out.println(count);
          
          StringTokenizer st = new StringTokenizer("I am coming Home" ," ");
          System.out.println("Splitting using StringTokenizer");
          while(st.hasMoreTokens()) 
          {
        	  System.out.println(st.nextToken());
          }
          
          String [] ar = s.split(" ");
          System.out.println("split mtd & Printing aray using foreach loop: ");
           for(String ss:ar) 
           {
        	System.out.println(ss);   
           }
           System.out.println("Printing aray using for loop: ");
           for(int i=0;i<ar.length;i++) 
           {
        	   System.out.print("  "+ar[i]);
           }
        	  
           System.out.println();
           System.out.println("comparision of String:"+s.equalsIgnoreCase(S));
           
           System.out.println("Addition of String : " +S.concat(s));
           
           System.out.println("USing Replace mtd");
           String re = S.replace("O" , "");
           System.out.println(re);
           
        	  
          
          
	}

	
}
