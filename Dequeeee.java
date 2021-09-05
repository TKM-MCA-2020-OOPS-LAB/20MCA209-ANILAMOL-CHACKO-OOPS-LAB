package myproject;

import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque; 
public class Dequeeee{  
    public static void main(String args[]) {
    	Deque<String> deqe = new ArrayDeque<String>();  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of employees:");
 	    int num=sc.nextInt();
 	    for(int i=1;i<=num;i++){
        System.out.print("Add the name of employee id="+i+"\n");
        String s=sc.next();
        deqe.add(s);
 	    }
 	   System.out.println("\nInitial list of employee after addition:"+deqe);
		System.out.println("\nAfter removing all employees:");
		for(int i =0;i<num;i++)
		{
				deqe.pop();
	 	}
		System.out.println("\nFinal list of employees:"+deqe);
    }
}