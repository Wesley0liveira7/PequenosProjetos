package entity;

public class Student {
	
	public String Name;
	public double n1;
	public double n2;
	public double n3;
	
	public double finalGrade () {
		return n1 + n2 + n3;
	}
	public double note () {
		return (100 * 60) / 100;
	}

}
