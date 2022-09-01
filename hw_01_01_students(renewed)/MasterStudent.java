package hw_01_01_students;

import java.util.Date;

public class MasterStudent extends GraduateStudent{
	public MasterStudent(int no,String name,int year,Date dob,String major, String advisor,String thesis){
		super(no,name,year,dob, major,advisor,thesis);
		
	}
	@Override
	void writeThesis() {
		System.out.println("Master Student writing thesis about "+ thesis);
		
		
	}
	@Override
	void meetWithAdvisor() {
		System.out.println("Master Student is on a meeting with advisor about "+ thesis);
		
	}
	@Override
	void study() {
		System.out.println("Master Student is studying");
		
	}
	@Override
	void register() {
		System.out.println("Master Student has just registered");

		
	}

}
