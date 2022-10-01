// Minimum Element
import java.util.*;

public class MinimumElement{
	private static Scanner sc = new Scanner(System.in);
	
	private static int readInteger(){
		// Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		return count;
	}
	
	private static int[] readElements(int value){
		// Scanner sc = new Scanner(System.in);
		int[] array = new int[value];
		
		for(int i = 0 ; i < array.length ; i++){
			array[i] = sc.nextInt();
		}
		
		// Arrays is the class inside the java.util.* package. 
		System.out.println(Arrays.toString(array));
		
		return array;
	}
	
	private static int findMin(int[] array){
		int minimum = array[0];
		for(int i = 1 ; i < array.length ; i++){
			if(minimum > array[i]){
				minimum = array[i];
			}
		}
		return minimum;
	}
	
	public static void main(String []args){
		int size = readInteger();
		int[] arr = readElements(size);
		System.out.print("Minimum Value: " + findMin(arr));
	}
}