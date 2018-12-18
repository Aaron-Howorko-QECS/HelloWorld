public class Parsing
{
	public static void main(String args[])
	{
	
		try
		{
			String a = args[0];
			String b = args[1];
			int NumA=Integer.parseInt(a);
			int NumB=Integer.parseInt(b);
			int sum = NumA + NumB;
			System.out.println(NumA + "+" + NumB + " = " + sum);
		}
		catch(NumberFormatException d)
		{
			System.out.println("\nthats not a number");
		}
		catch(ArrayIndexOutOfBoundsException c)
		{
			System.out.println("\nenter two numbers");
		}
		
	}
}