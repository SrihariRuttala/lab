abstract class one
{
	one()
	{
		System.out.println("Hell One");
	}
	abstract void print_one();
}
class two extends one
{
	void print_one()
	{
		System.out.println("hell hell");
	}
}
public class abstract_class
{
	public static void main(String args[])
	{
		two t = new two();
		t.print_one();
	}
}