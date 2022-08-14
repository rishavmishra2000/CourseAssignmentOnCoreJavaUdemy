// UserInputChallenge
import java.util.Scanner;

public class UserInputChallenge{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		int sum = 0;
		
		while(true){
			int order = counter + 1;
			System.out.println("Enter number #" + order + ":");
			
			boolean isAnInt = sc.hasNextInt();
			if(isAnInt){
				int number = sc.nextInt();
				counter++;
				sum = sum + number;
				if(counter == 10){
					break;
				}
			} else {
				System.out.println("Invalid Number!!!");
			}
			sc.nextLine();
		}
		System.out.println("Sum = " + sum);
		sc.close();
	}
}