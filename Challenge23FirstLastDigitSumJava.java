// FirstLastDigitSum
public class FirstLastDigitSum{
	public static void main(String []args){
		System.out.println(sumFirstAndLastDigit(252));
		System.out.println(sumFirstAndLastDigit(257));
		System.out.println(sumFirstAndLastDigit(0));
		System.out.println(sumFirstAndLastDigit(5));
		System.out.println(sumFirstAndLastDigit(-10));
	}
	
	public static int sumFirstAndLastDigit(int number){
		// 786 => 7 + 6 => 13
		int lastDigit, firstDigit=0;
		if(number < 0){
			return -1;
		} else {
			lastDigit = number % 10;
			while (number != 0){
				firstDigit = number % 10;
				number = number / 10;
			}
			return (firstDigit + lastDigit);
		}			
	}
}