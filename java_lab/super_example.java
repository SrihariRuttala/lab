import java.util.*;

class one
{
	int mile = 120;
	one()
	{
		System.out.println("One");
	}
}
class two extends one
{
	int mile = 150;
	two()
	{
		super();
		System.out.println("super mile : " + super.mile);
	}
}
public class super_example
{
	public static void main(String args[])
	{
		two t = new two();
	}
}