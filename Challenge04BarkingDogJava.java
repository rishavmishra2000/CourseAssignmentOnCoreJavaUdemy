// BarkingDog
public class BarkingDog{
	public static void main(String[] args){
		shouldWakeUp(true, 1);
		shouldWakeUp(false, 2);
		shouldWakeUp(true, 8);
		shouldWakeUp(true, -1);
		shouldWakeUp(true, 22)
	}
	
	public static boolean shouldWakeUp(boolean barking, int hourOfDay){
		if(hourOfDay < 0 || hourOfDay > 23){
			return false;
		} else {
			if(barking == true && (hourOfDay < 8 || hourOfDay > 22)){
				return true;
			} else {
				return false;
			}
		}
	}	
}