//Methods in Java
public class MethodInJava{
	public static void main(String []args){	
		int score = 6800;
		int levelCompleted = 3;
		int bonus = 200;
		
		if(score >= 5000){
			// int finalScore = score + (levelCompleted * bonus);			// Repeatation of code
			// System.out.println("Final Score: " + finalScore);			// Repeatation of code
			calculateFinalScore(score,levelCompleted,bonus);
		} else if(score < 5000 && score >= 1000){
			// int finalScore = score + (levelCompleted * bonus);			// same block of code repeated again
			// System.out.println("Final Score: " + finalScore);			// same block of code repeated again
			calculateFinalScore(score,levelCompleted,bonus);
		} else {                                                        
			// int finalScore = score + (levelCompleted * bonus);			// same block of code repeated again
			// System.out.println("Final Score: " + finalScore); 			// same block of code repeated again
			calculateFinalScore(score,levelCompleted,bonus);
		}	

		// calculateFinalScore(10000,8,200);
	}
	
	public static void calculateFinalScore(int score, int levelCompleted, int bonus){
		int finalScore = score + (levelCompleted * bonus);
		System.out.println("Final Score: " + finalScore);
	}
}