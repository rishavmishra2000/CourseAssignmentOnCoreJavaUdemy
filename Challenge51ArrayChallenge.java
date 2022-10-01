import java.util.Scanner;

public class SortedArray {
    //Scanner sc = new Scanner(System.in);
    
    public static void main(String []args){
		//Scanner sc = new Scanner(System.in);
        int unSortedArray[] = getIntegers(size);
        unSortedArray = sortIntegers(unSortedArray);
        printArray(unSortedArray);
    }
    
    public static int[] getIntegers(int size) {
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.print("Enter " + size + " integer values:\r");
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();    
        }
        
        return arr;
    }
    
    public static void printArray(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
    
    public static int[] sortIntegers(int[] unSortedArray){
        int[] SortedArray = new int[unSortedArray.length];
        for(int i = 0 ; i < SortedArray.length ; i++){
            SortedArray[i] = unSortedArray[i];
        }
        
        boolean status = true;
        
        while(status){
            status = false ;
            for(int i = 0 ; i < SortedArray.length - 1 ; i++){
                if(SortedArray[i] < SortedArray[i+1]){
                    SortedArray[i] = SortedArray[i] + SortedArray[i+1];
					SortedArray[i+1] = SortedArray[i] - SortedArray[i+1];
					SortedArray[i] = SortedArray[i] - SortedArray[i+1];
                    status = true;
                }
            }
        }
        return SortedArray;
    }
}