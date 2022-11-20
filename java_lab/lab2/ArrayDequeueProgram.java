import java.util.*;
import java.io.*;

public class ArrayDequeueProgram
{
	public static void main(String args[])
	{
		Deque<Integer> de_que = new ArrayDeque<Integer>(10);
		de_que.add(10);
		de_que.add(20);
		de_que.add(30);

		System.out.println(de_que);
	}
}