// LargestPrime
public class LargestPrime{
	public static void main(String []args){
		System.out.println(getLargestPrime(21));
		System.out.println(getLargestPrime(217));
		System.out.println(getLargestPrime(0));
		System.out.println(getLargestPrime(45));
		System.out.println(getLargestPrime(-1));
	}
	
	public static int getLargestPrime(int number){
		int largestPrimeNumber = 1;
		if(number <= 1){
			return -1;
		} else {
			boolean status = true;
			int m = 2, numbern;
			while(status){
				if(number % m != 0){
					m = m + 1;
				} else {
					numbern = number;
					number = number / m;
					if(number == 1){
						return numbern;
					}
				}
			}
			return -1;
		}
	}
}