class one
{
	int a = 10;
	void add()
	{
		System.out.println("add");
	}
}
class two extends one
{
	int a=2;
	void add()
	{
		System.out.println("hellman");
	}
}
public class overriding
{
	public static void main(String args[])
	{
		one t = new two();
		t.add();
		System.out.println(t.a);
	}
}