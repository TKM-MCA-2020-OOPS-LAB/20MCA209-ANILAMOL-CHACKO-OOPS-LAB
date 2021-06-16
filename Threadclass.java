package myproject;
import java.util.Scanner;

class Multithread extends Thread
{
	public void run()
	{
		System.out.println("Executing Multithread"+"\n");
				for(int i=1;i<=5;i++)
				{
					System.out.println(+5+"*"+i+"="+(5*i));
	}
}
}
class Primethread extends Thread
{
	public void run()
	{
		System.out.println("Executing Primethread"+"\n");
		Scanner sc = new Scanner(System.in);
		 int  i,n,p,count,flag;
		 
		 System.out.println("Enter the number of prime terms you want!");
		     n=sc.nextInt();
		     System.out.println("First "+n+" prime numbers are :-"); 
		 
		 p=2;
		     i=1; 
		     	while(i<=n)
		     {
		         flag=1;
		         for(count=2;count<=p-1;count++)
		         {
		             if(p%count==0)  
		             {
		              flag=0;
		              break;      
		             } 
		         }
		             if(flag==1)
		             {
		               System.out.print(p+" ") ;
		              i++;
		             }
		         p++;
		     }
	}
}

public class Threadclass {

	public static void main(String[] args)throws InterruptedException
	{
		Multithread M1=new Multithread();
		M1.start();
		M1.sleep(1000);
		
		Primethread P1=new Primethread();
		P1.start();
		P1.sleep(1000);
		
	}
		
	}
