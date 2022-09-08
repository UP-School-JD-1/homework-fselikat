package hw_01_01_students;

import java.util.Date;

public class VocationalStudent extends Student{
	public VocationalStudent(int no,String name,int year,Date dot,String major){
		super(no,name,year,dot, major);

	}
	@Override
	void study() {
		System.out.println("Vocational Student is studying");
		
	}
	@Override
	void register() {
		System.out.println("Vocational Student has just registered");
		
	}
	@Override
	public String toString() {
		return "VocationalStudent [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	

}
