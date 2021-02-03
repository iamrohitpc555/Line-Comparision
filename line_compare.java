public class compare_line {

	public static void main(String[] args)
	{
		int x1=1;
		int y1=3;
		int x2=3;
		int y2=7;
	
		double length1=Math.sqrt((x2-x1)*(x2-x1));
		double length2=Math.sqrt((y2-y1)*(y2-y1)); 
		
		String obj1 = String.valueOf(length1);
		String obj2 = String.valueOf(length2);
		
		double result=obj1.compareTo(obj2);
		
		 
		if(result == 0)
		{
			System.out.println("Both line are same");
		}
		else if (result > 0 )
		{
				System.out.println("Line 1 is bigger than Line 2");
		}
		else
			System.out.println("Line 2 is bigger than Line 1");
	}
		
			}         
			
