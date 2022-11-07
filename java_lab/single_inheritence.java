import java.util.*;

class one
{
	void one_print()
	{
		System.out.println("One");
	}
}
class two extends one
{
	void two_print()
	{
		System.out.println("Two");
	}
}
public class single_inheritence
{
	public static void main(String args[])
	{
		two t = new two();
		t.one_print();
		t.two_print();
	}
}