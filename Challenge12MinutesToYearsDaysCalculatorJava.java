// MinutesToYearsDaysCalculator
public class MinutesToYearsDaysCalculator{
	
	public static void main(String []args){
		printYearsAndDays(525600);
		printYearsAndDays(1051200);
		printYearsAndDays(561600);
		printYearsAndDays(-525600);
	}	
	
	public static void printYearsAndDays(long minutes){
		long hours = 60;
		long day = 24 * hours;
		long year = 365 * day;
		long minute = minutes;
		if (minute < 0)
			System.out.println("Invalid Value");
		else {
		    long years = minutes / year;
			minutes = minutes - years * year;
			long days = minutes / day;
		    System.out.println(minute + " min = " + years + " y and " + days + " d");
		}
	}
}