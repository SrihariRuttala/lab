import java.io.*;
import java.util.*;

public class LinkedListProgram
{
	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("A");
		ll.add("B");
		ll.addLast("C");
		ll.add(2,"E");

		System.out.println(ll);
	}
}