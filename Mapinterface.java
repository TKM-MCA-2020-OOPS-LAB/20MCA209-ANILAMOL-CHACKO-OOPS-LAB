package myproject;

import java.util.*;
public class Mapinterface {
	public static void main (String args[])
	{
		Map<Integer,String> hm=new HashMap<>();

		 hm.put(1, "Novrin");
	        hm.put(2, "Anannya");
	        hm.put(3, "Rasika");
	        System.out.println("Initial Map: "+ hm);
	        
	        hm.put( (2), "Riya");
	        hm.put((4), "Nithin");
	        //Updating..
	        System.out.println("Updated Map " + hm);
	  
	        //Removing..
	        hm.remove(4);
	  
	        // Final Map..
	        System.out.println("After Removing 4th entry, Final Map  is : "+hm);
	}

}