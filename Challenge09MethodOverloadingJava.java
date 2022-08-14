// MethodOverLoading
public class MethodOverloading {
	public static void main(String []args){
		System.out.println(calcFeetAndInchesToCentimeters(5, 8));
		System.out.println(calcFeetAndInchesToCentimeters(4, 14));
		System.out.println(calcFeetAndInchesToCentimeters(0, 3));
		System.out.println(calcFeetAndInchesToCentimeters(8));
		System.out.println(calcFeetAndInchesToCentimeters(16));
	}
	
	public static double calcFeetAndInchesToCentimeters(int feet, int inches){
		if(feet < 0 || (inches < 0 || inches > 12)){
			return -1;
		} else {
			double centimeter = (feet * 12 * 2.54) + (inches * 2.54); 
			return centimeter;
		}
	}
	
	public static double calcFeetAndInchesToCentimeters(int inches){
		if(inches < 0 || inches > 12){
			return -1;
		} else {
			double centimeter = (inches * 2.54);
			return centimeter;
		}
	}
}