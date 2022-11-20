import java.util.*;
import java.io.*;

public class PriorityQueueProgram
{
	public static void main(String args[])
	{
		PriorityQueue<String> pq = new PriorityQueue<>();

		pq.add("Geeks");
		pq.add("For");
		pq.add("Geeks");

		System.out.println("Intitial PriorityQueue" + pq);
		System.out.println(pq.poll());
		System.out.println(pq);
	}
}