package myproject;
import Arithmetic.ArithmeticOp;

import java.util.Scanner;

public class Arithmeticmain {
	public static void main(String args[])
	{
		float a,b;
		Scanner s=new Scanner(System.in);
		ArithmeticOp ar=new ArithmeticOp();
		while(true)
		{
			System.out.println("Enter 2 numbers to perform operations");
			System.out.println("Enter first number: ");
			a=s.nextFloat();
			System.out.println("Enter second number: ");
			b=s.nextFloat();
			System.out.println("Enter your choice: "+"\n"+"1.Addition"+"\n"+"2.Subtraction"+"\n"+"3.Multiplication"+"\n"+"4.Division"+"\n"+"5.Exit");
			int no=s.nextInt();
			switch (no)
			{
			case 1:
				ar.addition(a,b);
				break;
				 
			case 2:
				ar.subtraction(a,b);
				break;
				
			case 3:
				ar.multiplication(a,b);
				break;
				
			case 4:
				ar.division(a,b);
				break;
				
			default:
				System.exit(0);
				
			}
		}
		}


		}
