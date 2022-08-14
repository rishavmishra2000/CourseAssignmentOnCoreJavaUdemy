// PlayingCat
public class PlayingCat{
	public static void main(String []args){
		System.out.println(isCatPlaying(false,45));
	}
	
	public static boolean isCatPlaying(boolean summer, int temperature){
		if(summer){
			if(temperature >= 25 && temperature <= 45){
				return true;
			} else {
				return false;
			}
		} else {
			if(temperature >= 25 && temperature < 36){
				return true;
			} else {
				return false;
			}
		}
	}
}