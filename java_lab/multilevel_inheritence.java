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
class three extends two
{
	void three_print()
	{
		System.out.println("Three");
	}
}
public class multilevel_inheritence
{
	public static void main(String args[])
	{
		three t = new three();
		t.one_print();
		t.two_print();
		t.three_print();
	}
}