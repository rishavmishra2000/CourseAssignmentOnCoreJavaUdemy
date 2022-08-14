// Complex Operation
/* 
	 To add or subtract two complex numbers, just add or subtract the corresponding real and imaginary parts. For instance, the sum of 5 + 3i and 4 + 2i is 9 + 5i. For another, the sum of 3 + i and –1 + 2i is 2 + 3i.
	 
	ComplexNumber one = new ComplexNumber(1.0, 1.0);
    ComplexNumber number = new ComplexNumber(2.5, -1.5);
	
    one.add(1,1); (2,2)
    System.out.println("one.real= " + one.getReal());
    System.out.println("one.imaginary= " + one.getImaginary());
    one.subtract(number); (0.5,3.5)
    System.out.println("one.real= " + one.getReal());
    System.out.println("one.imaginary= " + one.getImaginary());
    number.subtract(one);
    System.out.println("number.real= " + number.getReal());
    System.out.println("number.imaginary= " + number.getImaginary());
*/

public class ComplexNumber{
	private double real;
	private double imaginary;
	
	public ComplexNumber(double real, double imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public double getReal(){
		return this.real;
	}
	
	public double getImaginary(){
		return this.imaginary;
	}
	
	public void add(double real,double imaginary){
		this.real += real;
		this.imaginary += imaginary;
	}
	
	public void add(ComplexNumber complexNumber){
		this.real += complexNumber.real;
		this.imaginary += complexNumber.imaginary;
	}
	
	public void subtract(double real,double imaginary){
		this.real -= real;
		this.imaginary -= imaginary;
	}
	
	public void subtract(ComplexNumber complexNumber){
		this.real -= complexNumber.real;
		this.imaginary -= complexNumber.imaginary;
	}
}

public class ComplexMain{
	public static void main(String []args){
		ComplexNumber one = new ComplexNumber(1.0, 1.0);
		ComplexNumber number = new ComplexNumber(2.5, -1.5);
		
		one.add(1,1); (2,2)
		System.out.println("one.real= " + one.getReal());
		System.out.println("one.imaginary= " + one.getImaginary());
		one.subtract(number); (0.5,3.5)
		System.out.println("one.real= " + one.getReal());
		System.out.println("one.imaginary= " + one.getImaginary());
		number.subtract(one);
		System.out.println("number.real= " + number.getReal());
		System.out.println("number.imaginary= " + number.getImaginary());
	}
}