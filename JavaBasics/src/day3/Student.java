package day3;

public class Student {

	public static void main(String[] args) {
		
		int marks;
		marks = 90;
		
		if(marks>=85 && marks<=100) {
			System.out.println("Distinction");
		}
		else if(marks>=70 && marks<85) {
			System.out.println("First Class");
		}
		else if(marks>=60 && marks<70) {
			System.out.println("First Class");
		}
		else {
			System.out.println("Student is failed");
		}
		

	}

}
