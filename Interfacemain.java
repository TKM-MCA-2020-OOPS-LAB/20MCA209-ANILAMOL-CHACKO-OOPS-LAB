package myproject;
import java.util.Scanner;

interface calculation
{
	void input();
	void area();
	void perimeter();
	
}
class Circle implements calculation
{
	int r=0;
	double pi=3.14, a=0, p=0 ;
	public void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius of circle:");
		r=s.nextInt();
	}
	public void area()
	{
		a=pi * r * r;
		System.out.println("Area of circle"+a);
	}
	public void perimeter()
	{
		p=pi * r * r;
		System.out.println("Area of perimeter"+p);
	}
	
}
class Rectangle extends Circle
{
	int l=0, b=0;
	double a,p;
	public void input()
	{
		input();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length of rectangle:");
		l=s.nextInt();
		System.out.println("Enter breadth of rectangle:");
		b=s.nextInt();
	}
	public void area()
	{
		area();
		a=l*b;
		System.out.println("Area of rectangle"+a);
	}
	
	public void perimeter()
	{
		perimeter();
		p=(2*l)+(2*b);
		System.out.println("perimeter of rectangle"+p);
	}	
	}
public class Interfacemain {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Rectangle R=new Rectangle();
		Circle C=new Circle();
		
		int no;
		System.out.println("Enter your choice");
		no=s.nextInt();
		int shapes =no;
		switch (no)
		{
		case 1:
			System.out.println("Area and perimeter of circle");
			C.input();
			C.area();
			C.perimeter();
			break;
		case 2:
			System.out.println("Area and perimeter of rectangle");
			R.input();
			R.area();
			R.perimeter();
			break;
		default:
			System.out.println("Wrong input");
		}
}
}
