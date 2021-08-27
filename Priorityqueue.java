package myproject;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Priorityqueue {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of elements:");
		int n=sc.nextInt();
		for(int i =0;i<n;i++)
		{
			System.out.println("Enter Elements: ");
			String ele=sc.next();
			pq.add(ele);
	 
		}
		System.out.println("Initial PriorityQueue " + pq);
		System.out.println("\nAfter Peek Method:"+pq.peek());
        System.out.println("\nAfter Poll Method: "+ pq.poll());
        Iterator iterator = pq.iterator();
        System.out.println("\nFinal PriorityQueue");
        while (iterator.hasNext()) {
        	System.out.print(iterator.next() + " ");
        }
	}
}
