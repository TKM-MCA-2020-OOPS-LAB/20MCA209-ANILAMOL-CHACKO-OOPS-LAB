package myproject;
import java.util.Scanner;

class Negative_Exception extends Exception {
	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID= 1L;

	public Negative_Exception(String s){
		super(s);
	}

}
public class AvgException {

	public static void main(String[] args) 
	{

	       int i,n;
	       float res=0,Avg;
		   Scanner sc=new Scanner(System.in);
	       System.out.println("enter how many numbers to cal  avg");
		   n=sc.nextInt();
	       int a[]=new int[n];
	       System.out.println("enter   "+n+"  numbers");
	       for(i=0;i<n;i++)
	       {
	       a[i]=sc.nextInt();
	       }
	       for(i=0;i<n;i++)
	       {
	    	   try
	    	   {
	    	    	if(a[i]<0)
	   
	    	    		throw new Negative_Exception(+a[i]+ "Enter number is negative!!");
	    	    	else
	    	    	{
	    	    		 res =res+a[i];
	    	    	}
	    	    }
	           catch (Negative_Exception ne) 
					{
                        ne.printStackTrace();
						System.out.println("Enter the numbers");
						a[i]=sc.nextInt();
						res=res+a[i];
					}	
	 
	    		 	 	    
	    	 	 
	    	    	}
	    	   
	    	    Avg=res/n;
	    	    System.out.println("Average="+Avg);
	       }
	    	    		

				

	}
	       