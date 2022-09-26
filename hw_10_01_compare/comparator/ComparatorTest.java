package hw_10_01_compare.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


import hw_10_01_compare.comparable.RegistrationOffice;
import hw_10_01_compare.comparable.Student;

public class ComparatorTest implements Comparator {

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
		Comparator<Student> comparator = (st1, st2) -> st1.getNo() - st2.getNo() ;
		System.out.println("Before sorting\n");
		students.forEach(System.out::println);
		Collections.sort(students,comparator);
		System.out.println("After sorting\n");
		students.forEach(System.out::println);
	}

	@Override
	public int compare(Object o1, Object o2) {
		Student st1 = (Student) o1;
		Student st2 = (Student) o2;

		if (st1.getNo() < st2.getNo())
			return -1;
		else if (st1.getNo() == st2.getNo())
			return 0;
		else
			return 1;
	}

}
