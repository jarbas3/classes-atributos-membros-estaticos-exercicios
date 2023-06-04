package ex03.entities;

public class Student {

	public String name;
	public double scoreA;
	public double scoreB;
	public double scoreC;
	
	public double finalScore() {
		return scoreA + scoreB + scoreC; 
	}
	
	public String toString() {
		if (finalScore() < 60.0) {
			return "FINAL GRADE = " 
		    + String.format("%.2f%n", finalScore()) 
		    + "FAILED\n"
		    + "MISSING "
		    + String.format("%.2f", 60.0 - finalScore())
		    + " POINTS";
		}
		else {
			return "FINAL GRADE = "
			+ String.format("%.2f%n", finalScore())
			+ "PASS"; 
		}
	}
}
