// GreatestCommonDivisor
public class GreatestCommonDivisor{
	public static void main(String []args){
		System.out.println(getGreatestCommonDivisor(12,30));
		System.out.println(getGreatestCommonDivisor(25,30));
		System.out.println(getGreatestCommonDivisor(9,18));
		System.out.println(getGreatestCommonDivisor(81,153));
	}
	
	public static int getGreatestCommonDivisor(int first, int second){
		if(first < 10 || second < 10){
			return -1;
		} else {
			// 12 -> 1,2,3,4,6,12
			// 30 -> 1,2,3,5,6,10,15,30 
			int result = 1;
			if(first == second){
				return first;
			} else {
				int checkValue = (first > second)? first/2 : second/2;
				for(int i = 2 ; i <= checkValue ; i++){
					if(first % i == 0 && second % i == 0){
						result = i;
					}
				}
				return result;
			}
		}
	}
}