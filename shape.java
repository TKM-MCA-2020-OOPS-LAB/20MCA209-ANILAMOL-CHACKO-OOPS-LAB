package myproject;
import java.util.Scanner;

public class Shapes 
{
 float area(float a)
 {
	 float sarea=a*a;
	 System.out.println("Area of Square: "+sarea);
	 return sarea;
	
 }
 float area(float a, float b)
 {
	 float rarea=a*b;
	 System.out.println("Area of Rectangle: "+rarea);
	 return rarea;
	
 }
 double area(double c)
 {
	 double carea=3.14*c*c;;
	 System.out.println("Area of Circle: "+carea);
	 return carea;
	
 }
public static void main(String[] arg) {
	Shapes ob= new Shapes();
	Scanner s= new Scanner(System.in);
	System.out.println("Enter sides of shapes:");
	float a=s.nextInt();
	float b=s.nextInt();
	double c=s.nextInt();
	ob.area(a);
	ob.area(a,b);
	ob.area(c);	
	
}
}
