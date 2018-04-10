package datastructure;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue<Integer> que1 = new LinkedList<>();
		// for adding data
		que1.add(10);
		que1.add(20);
		que1.add(30);
		que1.add(40);
		System.out.println("This is retrieving data using For loop with iterator...........");
		for(Integer it:que1) {
			System.out.println(it);
		}
		System.out.println("This is using peek ....."+que1.peek());

		System.out.println("This is using pool ......"+que1.poll());
		System.out.println("This is using remove....."+que1.remove(10));
		System.out.println("This is retrieving data using while loop with iterator........");

		Iterator it = que1.iterator();

		while(it.hasNext()) {
			System.out.println(it.next());

		}









	}
}
