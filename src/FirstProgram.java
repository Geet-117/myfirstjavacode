/**
 * 
 */
/**
 * 
 */
public class FirstProgram
{
	public int sumoftwonum(int a, int b)
	{
		/***
		 * Addition of 2 numbers
		 */

		int c = a + b;
		return c;
	}
	
	
	public static void main(String[] args)
	{
		FirstProgram obj = new FirstProgram();
		int a = 10;
		int b = 20;
		int c = obj.sumoftwonum(a,b);
		
		String printMessage = String.format("Sum of the numbers %s, %s is %s", String.valueOf(a),String.valueOf(b),String.valueOf(c));
	
		System.out.println(printMessage);
	}
}