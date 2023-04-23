package assignment_11;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key, Student> map = new HashMap<>();
		for(Student s:students)
		{
			Key key=new Key(s.getFirstName(), s.getLastName());
			map.put(key,s);
		}
		return map;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
		double totalGPA=0.0;
		int count=0;
		for(Student s: maps.values()){
			totalGPA+=s.getGpa();
			count++;
		}
		return totalGPA/count;
	}
}
