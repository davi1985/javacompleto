package course.chapter3.intropoo.exercise.entities;

public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}

	public double missingPoints() {
		return (finalGrade() < 60.0) ? 60.0 - finalGrade() : 00.0;
	}
}
