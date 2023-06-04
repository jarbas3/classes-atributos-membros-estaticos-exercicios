package ex03.application;

import java.util.Locale;
import java.util.Scanner;

import ex03.entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.scoreA = sc.nextDouble();
		student.scoreB = sc.nextDouble();
		student.scoreC = sc.nextDouble();
		
		System.out.println(student);
		
		sc.close();
	}
}
