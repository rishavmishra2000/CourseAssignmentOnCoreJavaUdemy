// SecondAndMinutestoHHMMSSFormat (Note: Leading 0's in single digit number)
public class SecondAndMinutestoHHMMSSFormat{
	public static void main(String []args){
		System.out.println(getDurationString(120,180));
		System.out.println(getDurationString(86400));
	}
	
	public static String getDurationString(int minutes, int seconds){
		if(minutes < 0 || seconds < 0 ){
			return "Invalid Value";
		} else {
			minutes = minutes + (seconds / 60);
			seconds = seconds % 60;
			int hours = minutes / 60;
			minutes = minutes % 60;
			
			String hoursString = hours + "h";
			if(hours < 10){
				hoursString = "0" + hoursString;
			}
			
			String minutesString = minutes + "m";
			if(minutes < 10){
				minutesString = "0" + minutesString;
			}
			
			String secondsString = seconds + "s";
			if(seconds < 10){
				secondsString = "0" + secondsString;
			}
			
			return hoursString + " " + minutesString + " " + secondsString;
		}
	}
	
	public static String getDurationString(int seconds){
		if(seconds < 0){
			return "Invalid Value";
		} else {
			int hours = 0;
			if(seconds >= 3600){
				hours = seconds / 3600;
				seconds = seconds - (3600 * hours);
			}
			int minutes = seconds / 60;
			seconds = seconds % 60;
			String hoursString = hours + "h";
			if(hours < 10){
				hoursString = "0" + hoursString;
			}
			
			String minutesString = minutes + "m";
			if(minutes < 10){
				minutesString = "0" + minutesString;
			}
			
			String secondsString = seconds + "s";
			if(seconds < 10){
				secondsString = "0" + secondsString;
			}
			
			return hoursString + " " + minutesString + " " + secondsString;
		}
	}
}