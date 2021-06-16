package myproject;
import java.util.Scanner;

class Fibthread implements Runnable
{

	@Override
	public void run() {
		
		    System.out.println(".....Executing Thread A........."+"\n");
		    int n=5, a = 0, b = 0, c = 1;
	        System.out.print("Fibonacci Series:"+"\n");
	        for(int i = 1; i <= n; i++)
	        {
	            a = b;
	            b = c;
	            c = a + b;
	            System.out.print(a+" ");
	            
	        }
		
	}
	
}
class Eventhread implements Runnable
{

	@Override
	public void run() {
		
		System.out.println("\n"+"......Executing Thread B........"+"\n");
		int n, i;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the limit : ");
		n = sc.nextInt();	
		
		for(i = 1; i <= n; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i +"\t"); 
			}
		}	
		
	}
	
}
public class Runnablethread {
	public static void main(String[] args)throws InterruptedException
	{
		Fibthread F1=new Fibthread();
		Thread t1=new Thread(F1);
		t1.start();
		Thread.sleep(1000);
		
		Eventhread E1=new Eventhread();
		Thread t2=new Thread(E1);
		t2.start();
		Thread.sleep(1000);
		
	}

}
