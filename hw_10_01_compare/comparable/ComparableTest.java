package hw_10_01_compare.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {

	public static void main(String[] args) {
		RegistrationOffice ro1=new RegistrationOffice();
		Student s1=ro1.getAStudent();
		Student s2=ro1.getAStudent();
		Student s3=ro1.getAStudent();
		Student s4=ro1.getAStudent();
		Student s5=ro1.getAStudent();
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		System.out.println("Before sorting\n");
		students.forEach(System.out::println);
		Collections.sort(students);
		System.out.println("After sorting\n");
		students.forEach(System.out::println);

	}

}
