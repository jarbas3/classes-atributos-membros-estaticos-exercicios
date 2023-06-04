package ex02.entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary = grossSalary / 100.0 * percentage + netSalary();
	}
	
	public boolean firstTime = false;	
	public String toString() {
		if (firstTime == false) {
			firstTime = true;
			return name + ", $ " + String.format("%.2f", netSalary());
		}
		else {
			return name + ", $ " + String.format("%.2f", grossSalary);
		}
	}
}
