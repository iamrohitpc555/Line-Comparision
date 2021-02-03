public class compare_line {

	public static void main(String[] args)
	{
		int x1=3;
		int y1=4;
		int x2=7;
		int y2=1;
	
		double a=Math.sqrt((x2-x1)*(x2-x1));
		double b=Math.sqrt((y2-y1)*(y2-y1)); 
		
		if(a==b)
		{
			System.out.println("Both line are same");
		}
		else if (a > b )
		{
				System.out.println("A is bigger than B");
		}
		else
			System.out.println("B is bigger than A ");
	}
}
