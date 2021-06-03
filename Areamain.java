package myproject;

import java.util.Scanner;

import graphics.Area;

public class Areamain{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	Area ar=new Area();
    int no;
    System.out.println("..............AREA OF DIFFERENT SHAPES.............."+"\n");
	System.out.println("Enter your choice: "+"\n"+"1.Rectangle"+"\n"+"2.Triangle"+"\n"+"3.Square"+"\n"+"4.Circle");
	no=s.nextInt();
	int shapes =no;
	switch (no)
	{
	case 1:
		System.out.println("...........RECTANGLE...........");
		ar.Rectangle();
		break;
		 
	case 2:
		System.out.println("..........TRIANGLE...........");
		ar.Triangle();
		break;
		
	case 3:
		System.out.println("..........SQUARE........");
		ar.Square();
		break;
		
	case 4:
		System.out.println("..........CIRCLE........");
		ar.Circle();
		break;
		
	default:
		System.out.println("Dafault input");
		
	}
}
}
