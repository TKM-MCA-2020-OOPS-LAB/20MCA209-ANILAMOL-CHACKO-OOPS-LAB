package myproject;
import java.util.Scanner;
import java.util.*; 
import java.util.Iterator;
import java.util.LinkedHashSet;
public class Linkedhashset{  
    public static void main(String args[]) {
    	LinkedHashSet<String> lsh = new LinkedHashSet<String>(); 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of employees:");
 	    int num=sc.nextInt();
 	    for(int i=1;i<=num;i++){
        System.out.print("Add the name of employee id="+i+"\n");
        String s=sc.next();
        lsh.add(s);
 	    }
 	   System.out.println("\nOriginal LinkedHashSet:"+lsh);
 	   System.out.println("\nRemove 'Manu':"+lsh.remove("Manu"));
 	   System.out.println("Size of LinkedHashSet:"+lsh.size());
       System.out.println("Checking if 'Amal' is present:"+lsh.contains("Amal"));
       System.out.println("Final LinkedHashSet:"+lsh);
       System.out.println("\nIterating...");
       Iterator itr = lsh.iterator();
       while(itr.hasNext())
       System.out.println(itr.next());
    }

}
