
public class UseOfSubstring {

	public static void main(String[] args) 
	{
	
		 String s= "welcometojava";
		 int k=3;

		        String smallest = s.substring(0,k);
		        String largest = s.substring(0,k);
		        for(int i=1;i<s.length()-k+1;i++)
		        {
		           if(s.substring(i,k+i).compareTo(smallest)<0) 
		           {
		               smallest = s.substring(i,k+i);
		           }
		           else if (s.substring(i,k+i).compareTo(largest)>0)
		           {
		               largest = s.substring(i,k+i);
		           }
		        }
		        
		        System.out.println(smallest + "\n" + largest);
		    
	}

}
