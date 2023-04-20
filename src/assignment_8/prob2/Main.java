package assignment_8.prob2;

import java.util.*;
public class Main {

	/** Combines the lists that are populated here into a single list
	 *  and passes to computeSumOfSalaries
	 */
	public static void main(String[] args) {
		List<Staff> staff = new ArrayList<>();
		staff.add(new Staff("Moynul", 110000, 2));
		staff.add(new Staff("Raj", 110000, 4));
		staff.add(new Staff("Reza", 120000, 1));
		staff.add(new Staff("Fahim",90000, 3));
		staff.add(new Staff("Rana", 100000,1));

		List<Teacher> teachers = new ArrayList<>();
		teachers.add(new Teacher("Khan", 110000, 10000));
		teachers.add(new Teacher("Zobair", 130000, 5500));
		teachers.add(new Teacher("Shafi", 135000, 12000));
		teachers.add(new Teacher("Shjed",95000, 8000));
		
		
		//Implementation steps
		//Step 1: implement the combine method, to combine the two lists
		List<EmployeeData> combined = combine(staff, teachers);

		
		//Step 2: pass the combined list to computeSumOfSalaries
		double salarySum = Statistics.computeSumOfSalaries(combined);
		System.out.println(salarySum);
		
	}
	
	//IMPLEMENT
	public static List<EmployeeData> combine(List<Staff> staff, List<Teacher> teachers) {
		List<EmployeeData> result = new ArrayList<>();
		result.addAll(staff);
		result.addAll(teachers);
		return result;
	}

}
