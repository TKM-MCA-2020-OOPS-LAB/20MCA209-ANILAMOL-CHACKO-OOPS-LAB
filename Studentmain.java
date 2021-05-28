package myproject;
import java.util.Scanner;

class Student
{
	int Studid;
	String name;
	int Academicmarks;
Student()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Student id:");
	Studid=s.nextInt();
	System.out.println("Enter Student name:");
	name=s.next();
	System.out.println("Enter Academic marks:");
	Academicmarks=s.nextInt();
	
}
}

class Sports extends Student
{
	String Category;
	int Sprtsmark;

Sports()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Sports category:");
	Category=s.next();
	System.out.println("Enter Sports mark:");
	Sprtsmark=s.nextInt();
	
}
}
class Result extends Sports
{
	int Total;
Result()
{
	Total=Academicmarks+Sprtsmark;
}
	
	
void display()
{
	System.out.println(".......ACADEMIC DETAILS.........");
	System.out.println("Student id: "+Studid);
	System.out.println("Student name: "+ name);
	System.out.println("Academic marks: "+ Academicmarks);
	System.out.println("Sports category: "+Category);
	System.out.println("Sports mark: "+Sprtsmark);
	System.out.println("Total marks: "+Total);
	System.out.println("..........................");
	
}
}
public class Studentmain {

public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number of Students: ");
	int n=s.nextInt();
	Result R[]=new Result[n];
	for(int i=0;i<n;i++)
	{
		R[i]=new Result();
	}
	for(int i=0;i<n;i++)
	{
		R[i].display();
	
	}
}
}
