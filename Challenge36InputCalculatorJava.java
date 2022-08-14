import java.util.Scanner;
import java.lang.Math;

public class InputCalculator{
	public static void main(String []args){
		inputThenPrintSumAndAverage();
	} 
	
	public static void inputThenPrintSumAndAverage(){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		double avg = 0;
		while(true){
			boolean isAnInt = sc.hasNextInt();
			
			if(isAnInt){
				int number = sc.nextInt();
				sum = sum + number;
				count ++;
			} else {
				if(count == 0){
					count++;
				}
				avg = (double) sum/count;
				System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
				break;
			}
		}
	}
}