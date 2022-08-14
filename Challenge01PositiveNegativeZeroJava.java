// Positive, Negative & Zero Challenge
public class Challenge01PositiveNegativeZero{
	public static void main(String []args){
		checkNumber(-5);
		checkNumber(10);
		checkNumber(0);
	}
	
	public static void checkNumber(int number){
		if(number > 0){
			System.out.println("Number is Positive");
		} else if(number < 0){
			System.out.println("Number is Negative");
		} else {
			System.out.println("Number is Zero");
		}
	}
}