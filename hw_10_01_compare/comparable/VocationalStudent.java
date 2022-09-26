package hw_10_01_compare.comparable;

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
		return "VocationalStudent [=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	

}
