// SharedDigit
public class SharedDigit{
	public static void main(String []args){
		System.out.println(hasSharedDigit(12,23));
		System.out.println(hasSharedDigit(9,99));
		System.out.println(hasSharedDigit(15,55));
		System.out.println(hasSharedDigit(12,13));
	}
	
	public static boolean hasSharedDigit(int num1, int num2){
		int num2Copy = num2;
		if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99){
			return false;
		} else {
			while(num1 != 0){
				int digit1 = num1 % 10;
				while(num2 != 0){
					int digit2 = num2 % 10;
					if(digit1 == digit2){
						return true;
					} else {
						num2 = num2 / 10;
					}
				} 
				num1 = num1 / 10;
				if(num2 == 0){
					num2 = num2Copy;
					continue;
				}
			}
			return false;
		}
	}
}