package Arithmetic;

interface operation
{
	void addition(float a, float b);
	void subtraction(float a, float b);
	void multiplication(float a, float b);
	void division(float a, float b);
}

public class ArithmeticOp implements operation
{

	@Override
	public void addition(float a, float b) {
		System.out.println("Add="+(a+b));
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subtraction(float a, float b) {
		System.out.println("Sub="+(a-b));
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplication(float a, float b) {
		System.out.println("Multiply="+(a*b));
		// TODO Auto-generated method stub
		
	}

	@Override
	public void division(float a, float b) {
		System.out.println("Div="+(a/b));
		// TODO Auto-generated method stub
		
	}
	

}
