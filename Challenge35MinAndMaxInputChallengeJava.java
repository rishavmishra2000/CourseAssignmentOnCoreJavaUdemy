// MinAndMaxInputChallenge
import java.util.Scanner;

public class MinAndMaxInputChallenge{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int min = 0;
		int max = 0;
		while(true){
			boolean isAnInt = sc.hasNextInt();
			if(isAnInt){
				int number = sc.nextInt();	
				if(min == 0 && max == 0){
					min = number;
					max = number;
				} else if(number >= max) {
					max = number;
				} else if(number <= min){
					min = number;
				}
			} else {
				System.out.println("Invalid Number!!!");
				break;
			}
			sc.nextLine();
		}
	}
}