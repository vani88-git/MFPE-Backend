package day3;

public class Employee {
	//calculate the tax amount depends on the salary

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary;
		salary = 1000000;
		if(salary<250000) {
			System.out.println("No tax");
		}
		else if(salary<=250000 && salary<500000) {
			System.out.println("Tax is 5%");
		}
		else if(salary>=500000 && salary<1000000) {
			System.out.println("Tax is 10%");
		}
		else if(salary>=1000000 && salary<1500000) {
			System.out.println("Tax is 15%");
		}
		else {
			System.out.println("Tax is 20%");
		}
	}

}
