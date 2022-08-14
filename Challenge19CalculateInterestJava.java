// calculateInterest
public class CalculateInterest{
	public static void main(String []args){
		int count = 1;
		
		System.out.println("*************Forward Traversing*************");
		for(int i = 2; i <= 8 ; i++){
			System.out.println("Interest of Rs. 10000/- @"+ i + "% is: " + String.format("%.2f", calculateInterest(10000.0, i)));
		}
		
		System.out.println("\n*************Reverse Traversing*************");
		for(int i = 8; i >= 2 ; i--){
			System.out.println("Interest of Rs. 10000/- @"+ i + "% is: " + String.format("%.2f", calculateInterest(10000.0, i)));
		}
		
		System.out.println("\n***********First 3 Prime Checks*************");
		for(int i = 1 ; i <= 100 ; i++){
			if(isPrime(i)){
				System.out.print(i + " ");
				count++;
				if(count > 3){
					break;
				}
			}
		}
	}
	
	public static boolean isPrime(int number){
		if(number == 1){
			return false;
		} 
		
		for(int i = 2 ; i <= number / 2 ; i++){
			if(number % i == 0){
				return false;
			}
		}
		
		return true;
	}
	
	public static double calculateInterest(double amount, int interest){
		return (amount * (interest / 100));
	}
}