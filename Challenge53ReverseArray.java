// Reverse Array Challenge
import java.util.*;

public class ReverseArray{	
	private static void reverse(int []array){
        System.out.println("Array = " + Arrays.toString(array));
	    int[] reverseArray = new int[array.length];
		for(int i = array.length - 1 ; i >= 0 ; i--){
		    reverseArray[array.length - 1 - i] = array[i];
		}
		System.out.println("Reversed array = " + Arrays.toString(reverseArray));
	}
	
	public static void main(String args[]){
		int[] array = new int[]{1,2,3,4,5};
		reverse(array);
		Arrays.toString(array);
	}
}