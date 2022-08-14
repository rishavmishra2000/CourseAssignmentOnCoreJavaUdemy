// NumberPalindrome
public class NumberPalindrome{
	public static void main(String []args){
		System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(707));
		System.out.println(isPalindrome(11212));
		System.out.println(isPalindrome(070));
	}
	
	public static boolean isPalindrome(int number){
		int reverse = 0;
		int original = number;
		while(number != 0){
			int lastDigit = number % 10;
			reverse = reverse * 10 + lastDigit;
			number = number / 10;
		}		
		
		if(reverse == original){
			return true;
		} else {
			return false;
		}
	}
}