// Sum 3 and 5 Challenge
public class Sum3and5{
	public static void main(String []args){
		
	}
	
	public static sumThreeAndFive(){
		int sum = 0, count = 1;
		for(int i = 1 ; i <=1000 ; i++){
			if((i % 3 == 0) && (i % 5 == 0)){
				System.out.println("Number divisible by both 3 and 5: " + i);
				sum = sum + i;
				count ++;
			}
			
			if(count > 5){
				break;
			}
		}
		
		System.out.println("Sum of first 5 number divisible by 3 and 5: " + sum);
	}
}