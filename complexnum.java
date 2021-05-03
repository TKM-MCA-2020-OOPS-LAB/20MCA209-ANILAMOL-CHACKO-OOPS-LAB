package myproject;
public class ComplexNumber{
   double a, b;
	
   ComplexNumber(double r, double i){
	this.a = r;
	this.b = i;
   }
	
   public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
   {
        ComplexNumber temp = new ComplexNumber(0, 0);

        temp.a = c1.a + c2.b;
        temp.b = c1.b + c2.b;
        
        return temp;
    }
    public static void main(String args[]) {
	ComplexNumber c1 = new ComplexNumber(5.5, 4);
	ComplexNumber c2 = new ComplexNumber(1.2, 3.5);
        ComplexNumber temp = sum(c1, c2);
        System.out.printf("Sum is: "+ temp.a+" + "+ temp.b +"i");
    }
}