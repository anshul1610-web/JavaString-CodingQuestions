
public class ImmutableClass 
{
	private int i;
	   static int   count =0;
	ImmutableClass(int i)
	{
		count++;
		this.i = i;
	}
	
	public   ImmutableClass  modify(int i) 
	{
		if(this.i==i) 
		{
			return this;
		}
		else 
		{
			
			return (new ImmutableClass(i));
		}
	}
	public static void main(String[] args) 
	{
		
		ImmutableClass t1 = new ImmutableClass(10);
		ImmutableClass t2 = t1.modify(122);
		ImmutableClass t3 = t2.modify(34);
		System.out.println(count);
		
		
		
	}

}
