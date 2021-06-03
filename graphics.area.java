package graphics;
import java.util.Scanner;
interface calcu
{
    void Rectangle();
    void Triangle();
    void Square();
    void Circle();

}
public class Area implements calcu
{
    Scanner sc=new Scanner(System.in);
    
    public void Rectangle()
    {
        System.out.println("Enter length:");
        int l=sc.nextInt();
        System.out.println("Enter breadth:");
        int b=sc.nextInt();
        System.out.println("Area of Rectangle:"+(l*b));
    }
    public void Triangle()
    {
        System.out.println("Enter the base:");
		int b = sc.nextInt();

		System.out.println("Enter the height:");
		int h = sc.nextInt();

		System.out.println("Area of the triangle:"+(0.5*b*h));
    }
   
    public void Square()
    {
        System.out.println("Enter the side:");
		int s = sc.nextInt();

		System.out.println("Area of the square:"+(s*s));
    }
    public void Circle()
    {
        System.out.println("Enter radius:");
        int r=sc.nextInt();
        System.out.println("Area of circle:"+(Math.PI*r*r));
    }

}

